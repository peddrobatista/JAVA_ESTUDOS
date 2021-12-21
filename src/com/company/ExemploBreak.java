package com.company;

public class ExemploBreak {
    public static void main(String[] args) {
        for ( int i = 1; i < 11; ++i) {
            if(i == 5)
                break; // interrompe o laço
            System.out.println("Valor de i = " + i);
        }
        System.out.println("Próxima linha após o loop...");
    }
}
