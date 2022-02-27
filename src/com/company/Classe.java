package com.company;

public class Classe {
    static int ano;
    static String nome;
    public static void mostrarNome() {
        System.out.println(nome); // Erro se a variável nome não é estática
    }
}
