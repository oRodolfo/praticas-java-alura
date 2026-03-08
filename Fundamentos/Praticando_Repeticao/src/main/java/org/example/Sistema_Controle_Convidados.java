package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema_Controle_Convidados {

    Scanner scanner = new Scanner(System.in);
    List<String> listaConvidados = new ArrayList<>();

    public void SistemaConvidados(){
        do{
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            String resposta = scanner.nextLine().toLowerCase();

            if(resposta.equals("sair")){
                System.out.println("Programa Finalizado!");
                break;
            } else if (resposta.equals("ver")) {
                System.out.println("Lista de convidados atualizada: " + listaConvidados);
            }else{
                if(listaConvidados.contains(resposta)){
                    System.out.println("Esse convidado ja esta na lista");
                }else{
                    listaConvidados.add(resposta);
                    System.out.println(resposta + " foi adicionado à lista de convidados");
                }
            }
        }while(true);
    }
}
