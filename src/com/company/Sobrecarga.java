package com.company;

public class Sobrecarga {
    void mostrar(int valor) {
        System.out.println("O valor informado foi " + valor);
    }
    void mostrar(String nome) {
        System.out.println("Foi informado o nome " + nome);
    }
}
