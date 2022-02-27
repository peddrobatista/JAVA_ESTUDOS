package com.grafico;

public class Circulo {
    public static final double PI = 3.1415; // Criação de constantes
    public void mostrar(){
        System.out.println("Método executado da classe Circulo do pacote grafico!!");
    }
    public int somar(int valor1, int valor2) {
        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }
    public int calcular(int[] lista) {
        int soma = 0;
        for(int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        return soma;
    }
    public int calcularr(int...lista) { //Os três pontos indica que pode passar qualquer valor do tipo int
        int soma = 0;
        for (int item : lista) {
            soma += item;
        }
        return soma;
    }
}
