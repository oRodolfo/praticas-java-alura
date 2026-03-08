package org.example;

import java.math.BigDecimal;

public class ProdutoPerecivel extends  Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, BigDecimal preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public ProdutoPerecivel setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
        return this;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Valor: R$" + getPreco() + ", Quantidade: " + getQuantidade() + ", Data de Validade: " + getDataValidade();
    }
}
