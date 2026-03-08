import java.util.Scanner;

public class ExercicioTemperatura {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura atual: ");
        double tempetaura = scanner.nextDouble();

        double formula = (tempetaura * 1.8) + 32;

        System.out.println("A temperatura atual em Celsius equivale a " + formula + " Fahrenheit");
    }
}
