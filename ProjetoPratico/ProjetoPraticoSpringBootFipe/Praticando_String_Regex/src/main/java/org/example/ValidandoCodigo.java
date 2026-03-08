package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCodigo {

    Scanner scanner = new Scanner(System.in);

    public void ValidandoCodigo(){
        System.out.println("Informe o codigo de referencia: ");
        String codigo = scanner.nextLine();

        String regex = "^[A-Z]{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codigo);

        if(matcher.matches()){
            System.out.println("O codigo de referencia está valido");
        }else{
            System.out.println("O codigo de referencia é invalido");
        }

    }
}
