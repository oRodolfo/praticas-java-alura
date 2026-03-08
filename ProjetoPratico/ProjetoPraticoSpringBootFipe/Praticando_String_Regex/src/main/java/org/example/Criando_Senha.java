package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Criando_Senha {

    Scanner scanner = new Scanner(System.in);

    public void ValidandoSenha(){

        System.out.println("Informe a senha: ");
        String senha = scanner.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);

        if(senha.matches(regex)){
            System.out.println("A senha é valida");
        }else{
            System.out.println("A senha é invalida");
        }
    }
}
