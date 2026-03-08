package org.example;

public class Comparando_Numeros {


    public void ComparandoNumeros(String[] valores) {

        if(valores.length == 2){
            int numero1 = Integer.parseInt(valores[0]);
            int numero2 = Integer.parseInt(valores[1]);

            if(numero1 > numero2){
                System.out.println("O valor " + numero1 + " é MAIOR");
            } else if (numero1 == numero2) {
                System.out.println("Ambos os valores são IGUAIS");
            }else {
                System.out.println("O valor " + numero2 + " é MAIOR");
            }
        }else{
            System.out.println("Informe 2 valores validos");
        }
    }
}
