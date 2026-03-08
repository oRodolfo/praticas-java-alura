package br.com.fiap.produtos.models;

import java.util.Objects;

public class Categoria {

    //definindo os atributos da classe categoria
    private long id;
    private String nome;

    //definindo o metodo construtor padrao da categoria
    public Categoria() {
    }

    //definindo o metodo construtor da classe
    public Categoria(long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    //definindo o metodo construtor sem o id
    public Categoria(String nome) {
        this.setNome(nome);
    }

    //definido os metodos getters e setters
    public long getId() {
        return id;
    }

    public Categoria setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    //definindo toString da classe
    @Override
    public String toString() {
        return nome.toUpperCase();
    }

    //verificando se há mais algum objeto igual e se tiver ele retorna essa informação

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
