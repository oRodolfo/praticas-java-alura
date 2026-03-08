package pratica.atividade.POO;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual){
        return this.preco - (this.preco * (percentual/100.0));
    }
}
