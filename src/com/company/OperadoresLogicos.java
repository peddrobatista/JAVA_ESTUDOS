package com.company;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 1, d = 20;
        System.out.println(b < a || c == 1); //OU, retorna T
        System.out.println( a == d && d != a); //E, retorna F
        System.out.println(!(c > b)); //Não, retorna F/T dependendo da situação
    }
}
