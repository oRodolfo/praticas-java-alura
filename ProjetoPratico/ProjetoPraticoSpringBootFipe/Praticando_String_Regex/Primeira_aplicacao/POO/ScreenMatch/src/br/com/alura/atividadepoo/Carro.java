package br.com.alura.atividadepoo;

public class Carro {

    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("MODELO: " + modelo);
        System.out.println("ANO: " + ano);
        System.out.println("COR: " + cor);
    }

    int CaculaIdadeCarro(){
        return 2025 - ano;
    }
}
