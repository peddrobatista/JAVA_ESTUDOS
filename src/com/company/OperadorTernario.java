package com.company;

public class OperadorTernario {
    public static void main(String[] args) {
        //<variavelouconstante> = <testelogico> ? <valorSeVerdadeiro>:<valorSeFalso>;
        int a = 2, b = 4;
        System.out.println(a + b > b - a ? "SIM" : "NÃO"); //O resultado é sim
    }
}
