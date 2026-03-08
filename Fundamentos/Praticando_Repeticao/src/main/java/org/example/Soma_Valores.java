package org.example;


public class Soma_Valores {

    public void CalculandoSoma(){
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
            for (int valor : valores) {
            soma += valor;
        }

            System.out.println("A soma total das receitas é: " + soma);
    }
}
