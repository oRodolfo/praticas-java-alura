package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Contando_Degrau exercicio1 = new Contando_Degrau();
        System.out.println("Digite a quantidade de degrau: ");
        int degrau = scanner.nextInt();
        exercicio1.ContandoDegrau(degrau);

        Soma_Valores exercicio2 = new Soma_Valores();
        exercicio2.CalculandoSoma();

        Soma_Valores_Par exercicio3 = new Soma_Valores_Par();
        exercicio3.SomandoTodosPares();

        Calculando_Fatorial exercicio4 = new Calculando_Fatorial();
        System.out.println("Informe o numero para fatorial: ");
        int numero = scanner.nextInt();
        exercicio4.CalculandoFatorial(numero);


        Encontrando_Maior_Numero exercicio5 = new Encontrando_Maior_Numero();
        exercicio5.SomandoValores();

        Verificando_Login exercicio6 = new Verificando_Login();
        exercicio6.ValidandoLogin();

        Nome_Valido exercicio7 = new Nome_Valido();
        exercicio7.ValidandoNome();

        Contagem_Positivo exercicio8 = new Contagem_Positivo();
        exercicio8.ContagemNumeros();

        Pulando_Numero_5 exercicio9 = new Pulando_Numero_5();
        System.out.println("Informe um numero inteiro: ");
        int numero1 = scanner.nextInt();
        exercicio9.ContandoNumeros(numero1);

        Sistema_Controle_Convidados exercicio10 = new Sistema_Controle_Convidados();
        exercicio10.SistemaConvidados();

        scanner.close();
    }
}