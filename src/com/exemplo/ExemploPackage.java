package com.exemplo;
import com.grafico.Circulo; // Importação do pacote.Classe
public class ExemploPackage {
    public static void main(String[] args) {
        Circulo c = new Circulo(); // Execução da classe do pacote grafico
        c.mostrar();
        int s;
        s = c.somar(5, 5);
        System.out.println("s = " + s);
    }
}
