package org.example;

public class Pulando_Numero_5 {

    public void ContandoNumeros(int numero){
        for(int i = 0; i <= numero; i++){
            if(i % 10 == 5){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
