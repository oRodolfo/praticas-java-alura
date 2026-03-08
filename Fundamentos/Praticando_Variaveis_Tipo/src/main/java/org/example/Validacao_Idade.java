package org.example;

public class Validacao_Idade {

    int idade;
    String mensagem;

    public void VerificandoIdade(int idade){
        if(idade >= 18){
            mensagem = "Você é maior de idade";
        }else{
            mensagem = "Você é menor de idade";
        }

        System.out.println(mensagem);
    }


}
