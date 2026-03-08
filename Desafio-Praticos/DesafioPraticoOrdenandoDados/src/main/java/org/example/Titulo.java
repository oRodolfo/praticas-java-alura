package org.example;

public class Titulo implements Comparable<Titulo>{

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Titulo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
