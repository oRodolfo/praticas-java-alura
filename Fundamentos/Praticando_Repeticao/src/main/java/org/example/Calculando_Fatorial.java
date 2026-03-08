package org.example;

public class Calculando_Fatorial {

    int numero;
    long fatorial = 1;

    public void CalculandoFatorial(int numero){
        if (numero < 0){
            System.out.println("Não há possibilidades de calcular o fatorial de numero negativo");
        }else{
            for(int i = 1; i <= numero; i++){
                fatorial = fatorial * i;
            }
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
