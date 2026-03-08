package br.com.alura.atividadepoo;

public class Musica {

    //atributos
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int qtdavaliacao;

    //metodos
    void ExibirInformacao(){
        System.out.println("TITULO: " + titulo);
        System.out.println("ARTISTA: " + artista);
        System.out.println("ANO LANCAMENTO: " + anoLancamento);
        System.out.println("AVALIACAO: " + avaliacao);
        System.out.println("QUANTIDADE AVALIACAO: " + qtdavaliacao);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        qtdavaliacao++;
    }

    double calculaMedia(){
        return avaliacao / qtdavaliacao;
    }
}
