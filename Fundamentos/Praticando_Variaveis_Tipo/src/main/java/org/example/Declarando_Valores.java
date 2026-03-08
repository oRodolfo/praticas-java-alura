package org.example;

public class Declarando_Valores {

    String nome;
    int idade;
    double altura;
    boolean estudando;

    public Declarando_Valores(String nome, int idade, double altura, boolean estudando) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estudando = estudando;
    }

    public String getNome() {
        return nome;
    }

    public Declarando_Valores setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Declarando_Valores setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public double getAltura() {
        return altura;
    }

    public Declarando_Valores setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public boolean isEstudando() {
        return estudando;
    }

    public Declarando_Valores setEstudando(boolean estudando) {
        this.estudando = estudando;
        return this;
    }

    public void imprimirResultado(){
        System.out.println("EXERCICIO 1 - DECLANDO VALORES PARA VARIAVEIS");
        System.out.println("NOME: " + getNome());
        System.out.println("IDADE: " + getIdade());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("É ESTUDANTE: " + isEstudando());
    }
}
