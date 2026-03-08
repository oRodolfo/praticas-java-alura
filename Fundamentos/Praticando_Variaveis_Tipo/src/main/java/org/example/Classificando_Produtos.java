package org.example;

public class Classificando_Produtos {

    public void VerificandoClassificacao(double valor){
        if(valor <= 50.00){
            System.out.println("Categoria do Produto: Econômico");
        } else if (valor < 200) {
            System.out.println("Categoria do Produto: Intermediário");
        }else{
            System.out.println("Categoria do Produto: Premium");
        }
    }
}
