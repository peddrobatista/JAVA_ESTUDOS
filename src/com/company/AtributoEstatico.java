package com.company;

import com.grafico.Circulo;

public class AtributoEstatico {
    public static void main(String[] args) {
        Classe a = new Classe();
        Classe b = new Classe();
        Classe c = new Classe();

        /* Ao alterar o valor do atributo estático ano da classe Classe pela instância as
           demais instâncias terão seus valores alterados também
        */
        a.ano = 2012;
        a.nome = "Ana"; // Acesso ao atributo não estático
        System.out.println(c.ano);
    }
}
