package org.example;

public class Removendo_espaco_String {

    String nome = "    João Silva ";
    public void RemovendoString(){
        System.out.println("Nome com espaço: " + nome);
        System.out.println("Nome sem espaço: " + nome.trim());
    }
}
