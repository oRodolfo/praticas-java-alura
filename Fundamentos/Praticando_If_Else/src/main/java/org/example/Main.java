package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Verifica_Par_Impar exercicio1 = new Verifica_Par_Impar();
        System.out.println("Informe um valor: ");
        int numero = scanner.nextInt();
        exercicio1.verificandoParImpar(numero);

        Aprovacao_Disciplina exercicio2 = new Aprovacao_Disciplina();
        System.out.println("Informe a media final do aluno: ");
        double media = scanner.nextDouble();
        exercicio2.VerificandoAprovacao(media);

        Validando_Senha exercicio3 = new Validando_Senha();
        System.out.println("Informe a senha do sistema: ");
        String senha = scanner.nextLine();
        exercicio3.VerificandoSenha(senha);

        Comparando_Numeros exercicio4 = new Comparando_Numeros();
        System.out.println("Informe 2 valores separandos por espaço: ");
        String numeros = scanner.nextLine();
        String[] valores = numeros.split(" ");
        exercicio4.ComparandoNumeros(valores);

        Verificando_Desconto exercicio5 = new Verificando_Desconto();
        System.out.println("Informe o valor total da compra: R$");
        double valorCompra = scanner.nextDouble();
        exercicio5.AplicandoDesconto(valorCompra);

        Verifica_Dia_Util exercicio6 = new Verifica_Dia_Util();
        System.out.println("Informe o dia da semana: ");
        String diaSemana = scanner.nextLine().toLowerCase();
        exercicio6.VerificandoDia(diaSemana);

        Verificando_Intervalo exercicio7 = new Verificando_Intervalo();
        System.out.println("Informe o valor para o emprestimo: ");
        double emprestimo = scanner.nextDouble();
        exercicio7.VerificandoIntervalo(emprestimo);

        Verificando_Triangulo exercicio8 = new Verificando_Triangulo();
        System.out.println("Informe o 1º lado, 2º lado e 3º lado, sucessivamente, separado por espaço: ");
        String lados = scanner.nextLine();
        String[] ladosTriangulos = lados.split(" ");
        exercicio8.CalculandoLados(ladosTriangulos);

        Verificando_Sangue exercicio9 = new Verificando_Sangue();
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Informe o seu peso: ");
        double peso = scanner.nextDouble();
        exercicio9.VerificandoCompatibilidade(idade, peso);

        Codigo_Acesso exercicio10 = new Codigo_Acesso();
        System.out.println("Informe o codigo de acesso: ");
        int codigoAcesso = scanner.nextInt();
        System.out.println("Informe o nivel de permissao para acesso: ");
        int nivelPermissao = scanner.nextInt();
        exercicio10.VerificandoAcesso(codigoAcesso, nivelPermissao);

        scanner.close();
    }
}