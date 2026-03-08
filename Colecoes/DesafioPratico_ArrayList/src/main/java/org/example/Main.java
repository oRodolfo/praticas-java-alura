package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Rodolfo", 21);
        Pessoa pessoa2 = new Pessoa("Julio", 19);
        Pessoa pessoa3 = new Pessoa("Arrascaeta", 25);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("1º Pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista completa: " + listaDePessoas.toString());

        //outra forma é para imprimir a lista inteira é:
        //System.out.println("Lista de Pessoas:");
        //for (Pessoa pessoa : listaDePessoas) {
        //    System.out.println(pessoa);
        //}
    }
}