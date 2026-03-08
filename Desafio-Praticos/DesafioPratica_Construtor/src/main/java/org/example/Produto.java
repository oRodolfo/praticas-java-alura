package org.example;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal preco;
    private int quantidade;

    public Produto(String nome, BigDecimal preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: R$" + getPreco() + ", Quantidade: " + getQuantidade();
    }
}
