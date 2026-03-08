package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extraindo_hastag {

    Scanner scanner = new Scanner(System.in);

    public void ExtraindoCaracter(){
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        String regex = "#\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hastags = new ArrayList<>();

        while (matcher.find()){
            hastags.add(matcher.group());
        }

        if(hastags.isEmpty()){
            System.out.println("Nenhuma # encontrada");
        }else {
            System.out.println("# Encontradas: " + String.join(", ", hastags));
        }
    }
}
