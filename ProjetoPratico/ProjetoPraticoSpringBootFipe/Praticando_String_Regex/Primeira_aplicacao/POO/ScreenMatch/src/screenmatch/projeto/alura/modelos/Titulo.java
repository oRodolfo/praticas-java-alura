package screenmatch.projeto.alura.modelos;

public class Titulo {

    //atributos = todas as informações que todos os filmes tem
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;

    //metodos getters (buscando um valor) e setters (atribuindo um valor)

    //utilizando o getters para buscando um valor
    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    //utilizando o setters para atribuir um valor as variaveis
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //metodo = tudo que a classe faz
    public void imprimirInformacao(){
        System.out.println("Nome screenmatch.projeto.alura.modelos.Filme: " + nome);
        System.out.println("Ano Lancamento: " + anoLancamento);
        System.out.println("Está incluido no Plano: " + incluidoNoPlano);
        System.out.println("Qual é a avaliação do filme: " + somaAvaliacao);
        System.out.println("Quantidade de avaliações do filme: " + totalDeAvaliacao);
    }

    public void avaliarFilme(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double calcularMediaNota(){
        return somaAvaliacao / totalDeAvaliacao;
    }
}
