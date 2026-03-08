package org.example;

public class Soma_Valores_Par {

    int somaPares = 0;

    public void SomandoTodosPares(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                somaPares += i;
            }else{
                continue;
            }
        }

        System.out.println("A soma dos numeros pares de 1 a 100 é: " + somaPares);
    }
}
