package org.example;

public class Verifica_Par_Impar {

    public void verificandoParImpar(int numero){
        if(numero % 2 == 0){
            System.out.println("O numero informado: " + numero + " é PAR");
        } else {
            System.out.println("O numero informado: " + numero + " é IMPAR");
        }
    }
}
