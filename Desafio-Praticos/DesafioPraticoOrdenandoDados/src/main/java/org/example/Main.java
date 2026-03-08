package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        //atividade 1
        ArrayList<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(35);
        numerosInteiros.add(10);
        numerosInteiros.add(21);

        sort(numerosInteiros);
        System.out.println(numerosInteiros);

        //atividade 2 e 3
        ArrayList<String> ordenandoTitulos = new ArrayList<>();

        ordenandoTitulos.add("Toy Story");
        ordenandoTitulos.add("The Flash");
        ordenandoTitulos.add("Carros 2");
        ordenandoTitulos.add("La Casa de Papel");

        sort(ordenandoTitulos);
        System.out.println(ordenandoTitulos);

        //atividade 4
        List<String> listArrayList = new ArrayList<>();
        listArrayList.add("Atividade 1");
        listArrayList.add("Atividade 2");
        listArrayList.add("Atividade 3");

        List<String> listLinkedList = new LinkedList<>();
        listLinkedList.add("Elemento A");
        listLinkedList.add("Elemento B");
        listLinkedList.add("Elemento C");

        System.out.println("ArrayList: " + listArrayList);
        System.out.println("LinkedList: " + listLinkedList);

        //atividade 5
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        listaPolimorfica.add("Elemento 3");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        listaPolimorfica.add("Elemento C");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}