package org.example;

public class Extraindo_Extensao {

    String arquivo = "relatorio_final.pdf";
    int posicaoponto = arquivo.lastIndexOf(".");
    public void ExtraindoExtensao(){
        System.out.println("Texto com extensao: " + arquivo);
        System.out.println("Texto sem extensao: " + arquivo.substring(0,posicaoponto));
    }
}
