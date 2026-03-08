package org.example;

public class Cadastro_Livro {

    String Titulo;
    String autor;
    int numeroPaginas;
    double precoLivro;
    char categorias;

    public Cadastro_Livro(double precoLivro, int numeroPaginas, String autor, String titulo) {
        this.precoLivro = precoLivro;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Cadastro_Livro setTitulo(String titulo) {
        Titulo = titulo;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Cadastro_Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public Cadastro_Livro setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
        return this;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public Cadastro_Livro setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
        return this;
    }

    public char getCategorias() {
        return categorias;
    }

    public Cadastro_Livro setCategorias(char categorias) {
        this.categorias = categorias;
        return this;
    }

    public void CriandoLivro(char categorias){
        switch (categorias){
            case 'F':
                System.out.println("Livro Cadastrado: " + getTitulo() +
                        ", de " + getAutor() +
                        ". Ele possui " + getNumeroPaginas() +
                        ", custa R$" + getPrecoLivro() +
                        "e pertence a categoria Ficção");
                break;
            case 'N':
                System.out.println("Livro Cadastrado: " + getTitulo() +
                        ", de " + getAutor() +
                        ". Ele possui " + getNumeroPaginas() +
                        ", custa R$" + getPrecoLivro() +
                        "e pertence a categoria Não-Ficção");
                break;
            case 'T':
                System.out.println("Livro Cadastrado: " + getTitulo() +
                        ", de " + getAutor() +
                        ". Ele possui " + getNumeroPaginas() +
                        ", custa R$" + getPrecoLivro() +
                        "e pertence a categoria Tecnologia");
                break;
            case 'H':
                System.out.println("Livro Cadastrado: " + getTitulo() +
                        ", de " + getAutor() +
                        ". Ele possui " + getNumeroPaginas() +
                        ", custa R$" + getPrecoLivro() +
                        "e pertence a categoria Historia");
                break;
            default:
                System.out.println("Categoria Invalida!");
        }
    }
}
