package org.example;

public class SubString_Na_String {

    String texto = "O gato caça o rato.";
    String palavra = "gato";

    public void VerificandoPalavraString(){
        if(!texto.contains(palavra)){
            System.out.println("Palavra não encontrada!");
        }else{
            System.out.println("Palavra *" + palavra + "* encontrada no texto!");
        }
    }
}
