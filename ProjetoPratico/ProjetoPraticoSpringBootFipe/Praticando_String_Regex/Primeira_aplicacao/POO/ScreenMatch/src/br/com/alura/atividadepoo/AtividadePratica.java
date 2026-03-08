package br.com.alura.atividadepoo;

public class AtividadePratica {
    public static void main(String[] args) {

        //passo1: Crie uma classe br.com.alura.atividadepoo.Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.ImprimirNaTela();
        System.out.println("\n");

        //passo2: Crie uma classe br.com.alura.atividadepoo.Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println("Dobro: " + calculadora.CalculaDobro(25));
        System.out.println("\n");

        //passo3: Crie uma classe br.com.alura.atividadepoo.Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.titulo = "Princesa";
        musica.artista = "Amado Batista";
        musica.anoLancamento = 1991;
        musica.avaliacao = 10;
        musica.qtdavaliacao = 4;
        musica.ExibirInformacao();
        musica.avaliarMusica(9.6);
        musica.calculaMedia();

        //passo4: Crie uma classe br.com.alura.atividadepoo.Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.modelo = "Jetta GLI";
        carro.ano = 2022;
        carro.cor = "Preto";

        carro.exibirFichaTecnica();
        System.out.println(carro.CaculaIdadeCarro());
        System.out.println("\n");

        //passo5: Crie uma classe br.com.alura.atividadepoo.Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe br.com.alura.atividadepoo.Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.nome = "Rodolfo";
        aluno.idade = 20;

        aluno.exibirInformacao();
    }
}
