package org.example;

import java.util.Scanner;

public class Nome_Valido {

    Scanner scanner = new Scanner(System.in);
    String nome;


    public void ValidandoNome(){
        do{
            System.out.println("Informe o seu nome: ");
            nome = scanner.nextLine();

            if(nome.length() < 3){
                System.out.println("Nome invalido, informe com pelo menos 3 caracter");
            }

        }while(nome.length() < 3);

        System.out.println("Nome " + nome + " Cadastrado com sucesso!");
    }
}
