package org.example;

import java.util.Scanner;

public class Substituindo_String {

    Scanner scanner = new Scanner(System.in);

    public void SubstituindoString(){
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.println("Digite a palavra a ser substituida: ");
        String palavra = scanner.nextLine();
        System.out.println("Digite a palavra nova: ");
        String palavraNova = scanner.nextLine();

        if(!texto.contains(palavra)){
            System.out.println("Palavra não encontrada!");
        }else{
            String novoTexto = texto.replace(palavra, palavraNova);
            System.out.println("Texto modificado: " + novoTexto);
        }
    }
}
