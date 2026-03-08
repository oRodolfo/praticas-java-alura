package org.example;

import java.util.Scanner;

public class Encontrando_Maior_Numero {

    Scanner scanner = new Scanner(System.in);

    public void SomandoValores(){
        System.out.println("Informe valores separados por espaço: ");
        String[] numerosSTR = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numSTR : numerosSTR){
            int num = Integer.parseInt(numSTR);
            if(num > maior){
                maior = num;
            }
        }

        System.out.println("O maior numero é: " + maior);

        scanner.close();
    }
}
