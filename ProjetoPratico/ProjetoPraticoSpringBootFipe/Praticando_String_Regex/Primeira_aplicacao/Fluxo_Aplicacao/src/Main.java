public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoPlanoAnual = true;
        double notaFilme = 8.6;
        String tipoPlano = "Normal";

        if (anoDeLancamento != 2020) {
            System.out.println("Esse filme é novo!");
        } else {
            System.out.println("Esse filme tem 5 anos de lançamento");
        }

        if (incluidoPlanoAnual && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado!");
        }else{
            System.out.println("Filme não Liberado!");
        }
    }
}