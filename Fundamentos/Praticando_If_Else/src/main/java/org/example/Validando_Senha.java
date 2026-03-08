package org.example;

public class Validando_Senha {

    String senhaDefinida = "rodolfo123456789!";

    public void VerificandoSenha(String senha){
        if(senha.equals(senhaDefinida)){
            System.out.println("Acesso permitido!");
        }else {
            System.out.println("Acesso negado!");
        }
    }
}
