package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCPF {

    Scanner scanner = new Scanner(System.in);

    public void ValidandoCPFStr(){
        System.out.println("Informe o seu CPF: ");
        String cpf = scanner.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);

        if(cpf.matches(regex)){
            System.out.println("O CPF: " +cpf+ " é valido");
        }else {
            System.out.println("O CPF não é valido");
        }
    }
}
