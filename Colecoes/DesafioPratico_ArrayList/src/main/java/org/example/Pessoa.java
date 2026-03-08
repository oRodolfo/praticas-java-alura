package org.example;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade();
    }
}
