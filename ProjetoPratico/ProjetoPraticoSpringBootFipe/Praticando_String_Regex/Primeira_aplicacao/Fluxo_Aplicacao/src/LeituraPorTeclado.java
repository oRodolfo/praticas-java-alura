import java.util.Scanner;

public class LeituraPorTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu filme favorito");
        String filme = scanner.nextLine();
        System.out.println("Seu filme favorito é " + filme);
        System.out.println("\n");

        System.out.println("Qual é o ano de lançamento dele: ");
        int anoLancamento = scanner.nextInt();
        System.out.println("Seu filme foi lancado há " + (2025 - anoLancamento) + " anos");
    }
}
