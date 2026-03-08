import java.util.Scanner;

public class DesafioPratico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPasso1 = 0;
        int n1Passo2 = 0;
        int n2Passo2 = 0;
        int escolhapasso3 = 0;

        //passo 1: Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        System.out.println("Informe um numero: ");
        numeroPasso1 = scanner.nextInt();
        if(numeroPasso1 >= 0){
            System.out.println("Numero informado é positivo!");
        } else{
            System.out.println("Numero informado é negativo!");
        }

        //passo 2: Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("Informe um numero: ");
        n1Passo2 = scanner.nextInt();
        System.out.println("Informe outro numero: ");
        n2Passo2 = scanner.nextInt();
        if (n1Passo2 == n2Passo2){
            System.out.println("Os numeros são iguais");
        } else if (n1Passo2 > n2Passo2) {
            System.out.println("O primeiro numero: " + n1Passo2 +" é maior");
        } else{
            System.out.println("O segundo numero: " + n2Passo2 + " é maior");
        }

        //passo 3: Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("Informe oq você deseja calcular: ");
        System.out.println("1 = Calcular área do quadrado ");
        System.out.println("2 = Calcular área do círculo");
        escolhapasso3 = scanner.nextInt();
        switch (escolhapasso3){
            case 1:
                System.out.println("Informe o lado do quadrado: ");
                int lado = scanner.nextInt();
                int ladoQuadrado = lado * lado;
                System.out.println("A area do quadrado é: " + ladoQuadrado + "cm");
                break;

            case 2:
                System.out.println("Informe o raio do circulo: ");
                int raio = scanner.nextInt();
                double pi = 3.14;
                double areaCirulo = (pi *(raio * raio));
                System.out.println("A area do circulo é: " + areaCirulo + "cm");

            default:
                System.out.println("Informe uma opcao valida");
        }

        //passo 4: Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        int numero = 0;
        System.out.println("Informe o valor para calcular a sua tabuada: ");
        numero = scanner.nextInt();
        for (int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.printf("%d x %d\n", numero, i, resultado);
        }

        //passo 5: Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("Informe um valor qualquer: ");
        int verifica = scanner.nextInt();
        if(verifica % 2 == 0){
            System.out.println("O numero informado é PAR!");
        }else {
            System.out.println("O valor informado é IMPAR!");
        }

        //passo 6: Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("Informe um numero para fazer o calculo de fatorial dele: ");
        int numeroFatorial = scanner.nextInt();
        int fatorial = 1;

        if (numeroFatorial < 0){
            System.out.println("Não há possibilidades para calcular o fatorial desse numero");
        }else {
            for(int i = 0; i <= numeroFatorial; i++){
                fatorial = fatorial * i;
            }
            System.out.println("o fatorial de " + numeroFatorial + " é: " + fatorial);
        }
    }
}
