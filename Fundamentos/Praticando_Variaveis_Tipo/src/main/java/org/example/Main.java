package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Declarando_Valores exercicio1 = new Declarando_Valores("Rodolfo Ribeiro", 21, 1.93, true);
        exercicio1.imprimirResultado();

        Conversao_Tipo exercicio2 = new Conversao_Tipo();
        exercicio2.ConverterValor();

        Tipos_Primitivos exercicio3 = new Tipos_Primitivos(7.5, 8.0, 9.0);
        System.out.printf("A média das notas é: " + exercicio3.CalcularMedia());

        Convertendo_Temperatura exercicio4 = new Convertendo_Temperatura();
        exercicio4.convertendoTemperatura(20);

        Cadastro_Livro exercicio5 = new Cadastro_Livro(39.90, 96, "Antonio de Saint-Exupéry", "O pequeno Principe");
        System.out.println("Informe a sigla da categoria do livro: F - Ficção; N - Não-ficção; T - Tecnologia; H - História");
        char categoriaLivro = scanner.next().charAt(0);
        exercicio5.CriandoLivro(categoriaLivro);

        Classificando_Produtos exercicio6 = new Classificando_Produtos();
        System.out.println("Informe um valor: R$");
        double valor = scanner.nextDouble();
        exercicio6.VerificandoClassificacao(valor);

        Verificando_Par_Impar exercicio7 = new Verificando_Par_Impar();
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();
        exercicio7.VerificandoParImpar(numero);

        Conversor_Moedas exercicio8 = new Conversor_Moedas();
        System.out.println("Informe a quantidade em R$ para o cambio: ");
        double reais = scanner.nextDouble();
        exercicio8.ConvertendoRealDolar(reais);

        Validacao_Idade exercicio9 = new Validacao_Idade();
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        exercicio9.VerificandoIdade(idade);

        Consumo_Autonomia exercicio10 = new Consumo_Autonomia(12.5, 50, 20,     200);
        exercicio10.AutonomiaCarro();

        scanner.close();
    }
}