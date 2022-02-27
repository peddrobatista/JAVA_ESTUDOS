package com.company;

public class StringUtils {
    public static String inverterString(String valor) {
        char[] letras = valor.toCharArray();
        char[] letrasIversas = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letrasIversas[letras.length - i - 1] =letras[i];
        }
        return new String(letrasIversas);
    }
}
