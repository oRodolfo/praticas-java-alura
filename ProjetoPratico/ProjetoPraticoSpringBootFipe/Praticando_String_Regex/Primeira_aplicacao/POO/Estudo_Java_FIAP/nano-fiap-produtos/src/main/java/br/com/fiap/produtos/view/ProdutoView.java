package br.com.fiap.produtos.view;

import br.com.fiap.produtos.models.Categoria;
import br.com.fiap.produtos.models.Produto;
import br.com.fiap.produtos.repository.ProdutoCollectionRepository;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProdutoView {


    public static Produto form(Produto produto) {
        Categoria categoria = null;

        do {
            categoria = CategoriaView.select(null);
        } while (categoria == null);

        String nome = "";
        do {
            nome = JOptionPane.showInputDialog("Nome do Produto", produto.getNome());

            if (nome.length() < 3) {
                JOptionPane.showMessageDialog(
                        null,
                        "O nome do produto precisa ter no minimo 3 digitos"
                );
            }
        } while (nome.equals(""));

        String descricao = "";
        do {
            descricao = JOptionPane.showInputDialog("Descricao do Produto", produto.getDescricao());

            if (descricao.length() < 5) {
                JOptionPane.showMessageDialog(
                        null,
                        "A descricao do produto precisa ter no minimo 5 digitos"
                );
            }
        } while (descricao.equals(""));

        double p = 0;
        do {
            try {
                p = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco do produto", produto.getPreco()));
            } catch (NumberFormatException e) {
                p = 0;
            }

            if (p <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Valor invalido"
                );
            }
        } while (p <= 0);

        BigDecimal preco = BigDecimal.valueOf(p);

        Produto ret = produto;
        ret.setNome(nome).setCategoria(categoria).setDescricao(descricao).setPreco(preco).setDataDeCadastro(LocalDateTime.now());

        return ret;
    }


    public void sucesso(){
        JOptionPane.showMessageDialog(
                null,
                "Produto Salvo Com Sucesso"
        );
    }

    public static void sucesso(Produto produto) {
        System.out.println(produto);
        JOptionPane.showMessageDialog(
                null,
                "Produto " + produto.getNome().toUpperCase() + " salvo com sucesso!");
    }


    public static Produto select(Produto produto){
        Produto ret = (Produto) JOptionPane.showInputDialog(
                null, //componente pai sendo null pq nao temos ainda
                "Selecione um produto",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                ProdutoCollectionRepository.findAll().toArray(), //recebe a opcao escolhida pelo usuario
                produto == null ? 1 : produto);

        return ret;
    }

    public static void update (Produto produto){
        form(produto);
        sucesso(produto);

        show(produto);
    }

    public static void show(Produto produto) {
        System.out.println(produto);
        String textoFormatado = String.format(
                "PRODUTO: " + produto.getNome() + System.lineSeparator() +
                "DESCRICAO: " + produto.getDescricao() + System.lineSeparator() +
                "CATEGORIA: " + produto.getCategoria().toString() + System.lineSeparator() +
                "Preco: %,.2f" + produto.getPreco());
        JOptionPane.showMessageDialog(null, textoFormatado);
    }
}
