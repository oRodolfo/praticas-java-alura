package br.com.fiap.produtos.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Produto {

    //definindo atributos da classe Produtos
    private long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime dataDeCadastro;
    private Categoria categoria;

    //definindo os metodos construtures
    //construtor padrao da classe
    public Produto() {
    }

    //construtor com os atributos da classe
    public Produto(long id, String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataDeCadastro(dataDeCadastro);
        this.setCategoria(categoria);
    }

    //construtor para cadastrar um produto sem o id
    public Produto(String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataDeCadastro(dataDeCadastro);
        this.setCategoria(categoria);
    }

    //criando os metodos getters e setters dos atributos
    public long getId() {
        return id;
    }

    public Produto setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public Produto setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Produto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    //criando toString() para produto
    @Override
    public String toString() {
        return nome.toUpperCase();
    }

    //verificando se há mais algum objeto igual e se tiver ele retorna essa informação
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
