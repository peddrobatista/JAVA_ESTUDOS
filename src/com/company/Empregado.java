package com.company;

public class Empregado {
    private String endereco;
    private int idade;
    // Nesse contexto a palavra this refere-se aos atributos da classe
    void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }
    String mostrar() {
        return (endereco + idade);
    }
}
