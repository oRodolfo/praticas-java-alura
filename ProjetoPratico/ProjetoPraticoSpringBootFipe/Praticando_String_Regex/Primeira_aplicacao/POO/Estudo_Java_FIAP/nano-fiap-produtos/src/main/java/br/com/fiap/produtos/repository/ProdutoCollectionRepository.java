package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.models.Categoria;
import br.com.fiap.produtos.models.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class ProdutoCollectionRepository {

    public static List<Produto> produtos;

    public static List<Produto> findAll(){
        return produtos;
    }

    static {
        produtos = new Vector<>();
        Produto celular = new Produto();
        celular.setNome("Iphone 15").setDescricao("Aparelho Telefone Movel da Apple").setCategoria(CategoriaCollectionRepository.findById(2l)).setDataDeCadastro(LocalDateTime.now()).setPreco(BigDecimal.valueOf(5000.00));

        save(celular);
    }

    public static Produto save(Produto produto){
        if(!produtos.contains(produto)){
            produto.setId(produtos.size() + 1);
            produtos.add(produto);

            return produto;
        } else{
            JOptionPane.showMessageDialog(null, "Já existe um produto criado com esse nome");
            return null;
        }
    }


    public static List<Produto> findByCategoria(Categoria categoria) {
        return produtos.stream().filter(p->p.getCategoria().equals(categoria)).toList();
    }

    public static Produto findById(Long id) {
        return produtos.stream().filter(produto -> produto.getId() == id).findFirst().orElse(null);
    }
}
