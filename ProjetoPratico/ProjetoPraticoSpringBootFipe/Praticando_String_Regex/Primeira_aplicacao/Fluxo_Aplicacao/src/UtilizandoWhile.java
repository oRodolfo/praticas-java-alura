import java.util.Scanner;

public class UtilizandoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalnota = 0;

        while(nota != -1) {
            System.out.println("Diga a sua avaliacao para o filme ou -1 para encerrar o processo: ");
            nota = scanner.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                totalnota++;
            }
        }

        System.out.println("Media Avaliacao " + (mediaAvaliacao/totalnota));
    }
}
