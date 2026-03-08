package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Shampoo", new BigDecimal("10.00"), 2);
        Produto produto2 = new Produto("Computador", new BigDecimal("1599.90"), 1);
        Produto produto3 = new Produto("Monitor", new BigDecimal("890.00"), 1);

        produtos.add(produto1);
        produtos.add(produto3);
        produtos.add(produto2);

        System.out.println("Tamanho lista: " + produtos.size());
        System.out.println("3º Produto da lista: " + produtos.get(2).getNome());

        System.out.println("Informação Construtor: " + produtos.toString());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", new BigDecimal("25.99"), 1, "01/2027");
        System.out.println(produtoPerecivel.toString());
    }
}