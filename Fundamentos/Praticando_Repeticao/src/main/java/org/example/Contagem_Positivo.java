package org.example;

import java.util.Scanner;

public class Contagem_Positivo {

    public void ContagemNumeros(){

        Scanner scanner = new Scanner(System.in);
        String resposta = "";
        int numero = 0, qtdPar = 0, qtdImpar = 0, positivo = 0, negativo = 0;

        do{
            System.out.println("Informe um numero inteiro (ou fim para encerrar): ");
            resposta = scanner.nextLine();

            if(!resposta.equals("fim")){
                numero = Integer.parseInt(resposta);
                if(numero % 2 == 0){
                    qtdPar++;
                } else if (numero % 2 != 0) {
                    qtdImpar++;
                }

                if(numero > 0){
                    positivo++;
                }else {
                    negativo++;
                }
            }

            if(resposta.equals("fim")){
                break;
            }

        }while(true);

        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);
        System.out.println("Números pares: " + qtdPar);
        System.out.println("Números impares: " + qtdImpar);
    }
}
