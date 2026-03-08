import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
    public static void main(String[] args) {

        //inicializando a variavel tentativa, a função de numero aleatorio e tbm iniciando a funcao de informar dados do teclado
        int tentativas = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //criando o numero aleatorio de 0 a 100
        int numeroAleatorio = random.nextInt(101);

        for (int i = 0; i <= 5; i++){
            System.out.println("Informe um numero de 0 a 100: ");
            int numeroInformado = scanner.nextInt();

            if (numeroInformado == numeroAleatorio){
                System.out.println("Você acertou o numero sorteado! Numero Sorteado: " + numeroAleatorio);
                break;
            } else if (numeroInformado > numeroAleatorio) {
                System.out.println("Numero informado é maior do que o sorteado, informe um valor menor");
                tentativas++;
            }else {
                System.out.println("Numero informado é menor do que o sorteado, informe um valor maior");
                tentativas--;
            }
        }
    }
}
