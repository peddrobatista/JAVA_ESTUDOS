package com.company;

public class ExemploAtribuicao {
    public static void main(String[] args) {
        /* Quando atribuimos variáveis de tipos construídos
           o objeto que recebe essa atribuição tem seu valor
           ou valores perdidos.
        */
        Pessoa joao = new Pessoa();
        Pessoa maria = new Pessoa();

        joao.sexo = "M";
        joao.idade = 45;

        maria.sexo = "F";
        maria.idade = 17;

        joao = maria; // atribuição realizada
        // As variáveis joao e maria fazem referência ao mesmo objeto
        System.out.println("João sexo = " + joao.sexo);
        System.out.println("João idade = " + joao.idade);
        // Qualquer alteração feita no objeto refletirá nas duas variáveis
        joao.idade = 50;
        System.out.println("Maria idade = " + maria.idade);
        joao.sexo = "M";
        System.out.println("Maria sexo = " + maria.sexo);
    }
}
