package org.example;

public class Convertendo_Temperatura {
    int celsius;


    public void convertendoTemperatura(int celsius) {

        double fahrenheit = ((celsius * 9/5) + 32);
        System.out.println("EXERCICIO 4 - CONVERTENDO TEMPERATURA");
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }

}
