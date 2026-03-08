package org.example;

public class Formantando_Valores {

    double valorTotal =  19.9876;

    public void FormatandoNumero(){
        System.out.println("Valor sem formatacao: " + valorTotal);
        System.out.printf("valor com formatacao: R$%.2f", valorTotal);
    }
}
