import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //passo 1: PEDIR INFORMAÇÕES INICIAIS DO USUARIO (NOME. TIPO DE CONTA, SALDO)
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu tipo de conta: ");
        String tipoConta = scanner.nextLine();
        System.out.println("Informe o saldo da sua conta: ");
        double saldoInicial = scanner.nextDouble();

        //passo 2: CRIAR PAINEL INTERATIVO PARA O USUARIO
        System.out.println("======================");
        System.out.println("NOME: " + nome);
        System.out.println("TIPO CONTA: " + tipoConta);
        System.out.println("SALDO CONTA: " + saldoInicial);
        System.out.println("======================");
        System.out.println("\n");
        int escolha = 0;

        while(escolha != 4){
            System.out.println("==============================");
            System.out.println("SELECIONE ALGUMAS DAS OPÇÕES: ");
            System.out.println("1. CONSULTAR SALDO ");
            System.out.println("2. RECEBER VALOR   ");
            System.out.println("3. TRANSFERIR VALOR");
            System.out.println("4. SAIR");
            System.out.println("==============================");

            escolha = scanner.nextInt();
            if(escolha == 1){
                System.out.println("SEU SALDO ATUAL É: R$" + saldoInicial);

            } else if (escolha == 2) {
                System.out.println("Informe a quantidade que você irá receber: R$");
                double receberValor = scanner.nextDouble();

                saldoInicial += receberValor;
                System.out.println("Atualizando seu saldo atual: R$"+ saldoInicial);

            } else if (escolha == 3) {
                System.out.println("Informe a quantidade que você irá transferir: R$");
                double transferirValor = scanner.nextDouble();

                if (transferirValor > saldoInicial){
                    System.out.println("Você não tem saldo sulficiente para fazer a transferencia!");
                } else{
                    saldoInicial -= transferirValor;
                    System.out.println("Atualizando seu saldo atual: R$" + saldoInicial);
                }
            } else if (escolha != 4){
                System.out.println("Informe uma opção valida!");
            }
        }
    }
}