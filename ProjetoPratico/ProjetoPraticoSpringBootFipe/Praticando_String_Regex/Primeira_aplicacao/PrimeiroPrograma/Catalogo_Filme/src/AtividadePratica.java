import java.util.Locale;
import java.text.DecimalFormat;
public class AtividadePratica {
    public static void main(String[] args) {

        //passo 1: Crie um programa que realize a média de duas notas decimais e exiba o resultado
        double nota1 = 9.5;
        double nota2 = 5.1;
        System.out.println("Media Passo 1: " + ((nota1 + nota2)/2));

        //passo 2: Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double notaformatada1 = (int) 9.5;
        int notaformatada2 = 6;
        System.out.println("Media Passo 2: " + ((notaformatada1 + notaformatada2)/2));

        //passo 3: Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letraNome = 'R';
        String nomeCompleto = "Rodolfo";
        System.out.println("Meu nome é " + nomeCompleto + " E a primeira letra do meu nome é " + letraNome);

        //passo 4: Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 5.59;
        int quantidade = 4;
        System.out.println("Valor total da compra é de: R$" + (precoProduto * quantidade));

        //passo 5: Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 4.94;
        double qtdreal = 25.59;
        double conversao = valorEmDolares * qtdreal;
        System.out.printf("A sua quantidade em R$%.2f equivale a $%.2f",qtdreal,conversao);

        //passo 6: Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 1125.00;
        double percentualDesconto = 25;
        double valorfinal = (precoOriginal - (precoOriginal * (percentualDesconto / 100)));
        System.out.println("O produto tem um preco de R$" + precoOriginal + " e vamos dar " + percentualDesconto + "% e com isso o valor final será R$" + valorfinal);
    }
}
