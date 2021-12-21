package com.company;

public class Conversao {
    public static void main(String[] args){
        //Conversao com base no autocast
        /**
         * short é maior do que byte
         * int é maior do que short
         * Long é maior do que int
         * double é maior do que float
         * */
       /* int ano = 2014;
        long anoAtual = ano;
        float salarioMinimo = 200.15f;
        double salarioTotal = salarioMinimo;*/
        /*Conversao ao contrario (Essas conversoes de baixo vao dar erro, pois o java entende que
        as variaveis são pequenas demais para aquele tipo
        */
        /*long ano = 2014;
        int anoAtual = ano;
        double salarioMinimo = 200.15;
        float salarioTotal = salarioMinimo;
         */
        //Logo a solução para esse problema se encontra abaixo
        long ano = 2014;
        int anoAtual = (int) ano;
        double salarioMinimo = 200.15;
        short n1 = 10;
        byte n2 = (byte) n1;
        int n3 = 200;
        short n4 = (short) n3;
        float salarioTotal = (float) salarioMinimo;
        long cpf = 1234567;
        char cpf2 = (char) cpf;
        String texto = " Meu Projeto";
        System.out.println("Deu certo aqui!!!" + texto);
        DiasDaSemana diaBom = DiasDaSemana.SABADO;

        System.out.println();
    }

}
