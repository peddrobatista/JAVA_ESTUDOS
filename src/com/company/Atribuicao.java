package com.company;


public class Atribuicao {
    public static void main(String[] args){
        //Atribuição de valores
        char resposta = 'n';
        boolean flag = false;
        System.out.println(resposta);
        System.out.println(flag);
        int x = 3;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        y = 5;
        System.out.println("y = " + y);
        String endereco = "Rua x";
        String novoendereco = (endereco);
        System.out.println(novoendereco);
    }
}
