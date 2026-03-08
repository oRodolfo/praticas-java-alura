import screenmatch.projeto.alura.modelos.Episodios;
import screenmatch.projeto.alura.modelos.Filme;
import screenmatch.projeto.alura.modelos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        //instanciando a classe screenmatch.projeto.alura.modelos.Filme
        Filme filme1 = new Filme();
        filme1.setNome("Toy Story");
        filme1.setAnoLancamento(1995);
        filme1.setIncluidoNoPlano(true);

        filme1.imprimirInformacao();
        filme1.avaliarFilme(9.5);
        filme1.avaliarFilme(4.9);
        System.out.println("Total Avaliação: " + filme1.getTotalDeAvaliacao());
        System.out.println(filme1.calcularMediaNota());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filme1);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setNumero(2);
        episodios.setTotalVisualizacao(350);
        filtroRecomendacao.filtra(episodios);
    }
}
