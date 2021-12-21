package com.company;

public class ExemploSwitchCasePaises {
    public static void main(String[] args) {
        String pais = "EUAs";
        switch (pais) {
            case "Brasil":
            case "Portugual":
                System.out.println("Bom dia...");
                break;
            case "França":
                System.out.println("Bon Jour...");
                break;
            case "México":
            case "Argentina":
            case "Espanha":
                System.out.println("Buenos Días...");
                break;
            default:
                System.out.println("Good Morning!...");
        }
    }
}
