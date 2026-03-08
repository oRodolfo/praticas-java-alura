package org.example;

import java.util.Scanner;

public class Conversao_Tipo {

    Scanner scanner = new Scanner(System.in);

    public void ConverterValor() {
        System.out.println("Informe a quantidade do produto no estoque: ");
        double valor = scanner.nextDouble();

        int valorInt = (int) valor;

        System.out.println("EXERCICIO 2 - CONVERSAO DE TIPO");
        System.out.println("A quantidade do valor inteira do valor é: " + valorInt);
        scanner.close();
    }
}
