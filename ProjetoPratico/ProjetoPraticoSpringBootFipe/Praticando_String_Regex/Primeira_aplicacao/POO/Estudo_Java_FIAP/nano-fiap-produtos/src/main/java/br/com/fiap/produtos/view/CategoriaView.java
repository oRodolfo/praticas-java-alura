package br.com.fiap.produtos.view;

import br.com.fiap.produtos.models.Categoria;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria){
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null, //componente pai sendo null pq nao temos ainda
                "Selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                repository.findAll().toArray(), //recebe a opcao escolhida pelo usuario
                categoria == null ? 1 : categoria);

        return ret;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(
                null,
                "Categoria Salva Com Sucesso"
        );
    }

    public void sucesso(Categoria categoria) {
        System.out.println(categoria);
        JOptionPane.showMessageDialog(
                null,
                "Categoria " + categoria.getNome().toUpperCase() + " salva com sucesso!");
    }

    public static Categoria form(Categoria categoria){
        String nome = JOptionPane.showInputDialog(
                "Informe o nome da Categoria",
                categoria
        );

        return new Categoria(nome);
    }
}
