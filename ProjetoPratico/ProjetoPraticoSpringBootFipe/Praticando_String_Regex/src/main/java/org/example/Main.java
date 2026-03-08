package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Removendo_espaco_String exercicio1 = new Removendo_espaco_String();
        exercicio1.RemovendoString();
        System.out.printf("%n");

        Convertendo_Maiusculo_Minusculo exercicio2 = new Convertendo_Maiusculo_Minusculo();
        exercicio2.ConvertendoMm();
        System.out.printf("%n");

        Substituindo_String exercicio3 = new Substituindo_String();
        exercicio3.SubstituindoString();

        Extraindo_Extensao exercicio4 = new Extraindo_Extensao();
        exercicio4.ExtraindoExtensao();

        SubString_Na_String exercicio5 = new SubString_Na_String();
        exercicio5.VerificandoPalavraString();

        Formantando_Valores exercicio6 = new Formantando_Valores();
        exercicio6.FormatandoNumero();

        ValidandoCodigo exercicio7 = new ValidandoCodigo();
        exercicio7.ValidandoCodigo();

        ValidandoCPF exercicio8 = new ValidandoCPF();
        exercicio8.ValidandoCPFStr();

        Extraindo_hastag exercicio9 = new Extraindo_hastag();
        exercicio9.ExtraindoCaracter();

        Criando_Senha exercicio10 = new Criando_Senha();
        exercicio10.ValidandoSenha();

        scanner.close();
    }
}