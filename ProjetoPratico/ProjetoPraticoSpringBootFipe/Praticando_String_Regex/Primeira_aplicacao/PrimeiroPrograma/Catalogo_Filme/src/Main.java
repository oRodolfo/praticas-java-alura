public class Main {
    public static void main(String[] args) {
        System.out.print("Bem vindo a 2º aula de Java!");
        System.out.println("\n");
        System.out.println("Filme: Top Gun Maverick");

        //criando a varial para armazenar o ano de lancamento do filme top gun maverick
        int ano = 2022;
        System.out.println("Ano de Lançamento de TOP GUN MAVERICK: " + ano);
        System.out.println("\n");

        //criando a interacao de variavel do tipo boolean
        boolean incluidoPlano = true;
        //afirmando que o usuario esta no Plano Anual
        System.out.println("O usuario esta cadastrado no Plano Anual? " + incluidoPlano);
        System.out.println("\n");
        //negando que o usuario esta no Plano Anual
        System.out.println("O usuario esta cadastrado no Plano Anual? " + (!incluidoPlano));

        //criando a variavel para armazenar a nota do filme
        double notaFilme = 9.75;
        System.out.println("A Nota do filme Top Gun Maverick é: " + notaFilme);

        //criando a media de nota do filme sem variavel
        double media = (9.8 + 10)/2;
        System.out.println("A media de nota do filme é: " + media);

        //criando a media de nota do filme utilizando variavel
        double nota1 = 9.7;
        double nota2 = 6.5;
        double mediaVarial = (nota1 + nota2)/2;
        System.out.println("A media utilizando varial é: " + mediaVarial);
        System.out.println("\n");

        //criando a variavel String
        String sinopse = "Filme de aventura com participal de Tom Cruise";
        System.out.println("Sinopse do filme: " + sinopse);

        System.out.println("\n");
        //formatando o print sobre os dados do filme Toy Story
        String nomeFilme = "Toy Story";
        int anoLancamento = 1995;
        String sinopseFilme = "O filme descreve sobre os brinquedos do personagem Andy que ganham vida secretamente";
        int avaliacaoFilme = 10;
        String informacaoToyStory = """
                                    Filme: %s
                                    Ano de Lancamento: %d
                                    Sinopse do Filme: %s
                                    Nota do Filme: %d
                                    """.formatted(nomeFilme, anoLancamento, sinopseFilme, avaliacaoFilme);

        System.out.println(informacaoToyStory);
    }
}