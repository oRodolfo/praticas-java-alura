package org.example;

public class Codigo_Acesso {

    int codigoAcesso = 2023;
    int nivelPermissao;

    public void VerificandoAcesso(int codigoAcesso, int nivelPermissao){
        if ((codigoAcesso == 2023) && (nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3)){
            System.out.println("Acesso permitido! Bem vindo ao sistema");
        }else{
            System.out.println("Acesso negado! Informe o codigo e o nivel de permissao valido");
        }
    }
}
