package org.example;

import java.util.Scanner;

public class Verificando_Login {

    Scanner scanner = new Scanner(System.in);
    String senhaCorreta = "123456!";


    public void ValidandoLogin(){
        for(int i = 3; i > 0; i--){
            System.out.println("Informe a senha para o login: ");
            String senha = scanner.nextLine();

            if(senha.equals(senhaCorreta)){
                System.out.println("Senha Correta! Acesso concedido");
                break;
            } else if (i > 1) {
                System.out.println("Senha Incorreta! Acesso negado");
                System.out.println("Você tem mais " + (i - 1)+ " tentativas restantes");
            }else {
                System.out.println("Conta Bloqueada Temporariamente");
            }
        }
    }
}
