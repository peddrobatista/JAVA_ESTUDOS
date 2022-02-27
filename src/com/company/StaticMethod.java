package com.company;

public class StaticMethod {
    public static void main(String[] args) {
        Classe2.metodoEstatico(); // Não precisa ser instanciada
        new Classe2().metodoNaoEstatico(); // Está sendo instanciada
        String inverso = StringUtils.inverterString("ROMA");
        System.out.println(inverso);
    }
}
