package org.example;

public class Tipos_Primitivos {

    double nota1, nota2, nota3;

    public Tipos_Primitivos(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public Tipos_Primitivos setNota1(double nota1) {
        this.nota1 = nota1;
        return this;
    }

    public double getNota2() {
        return nota2;
    }

    public Tipos_Primitivos setNota2(double nota2) {
        this.nota2 = nota2;
        return this;
    }

    public double getNota3() {
        return nota3;
    }

    public Tipos_Primitivos setNota3(double nota3) {
        this.nota3 = nota3;
        return this;
    }

    public double CalcularMedia(){
        return ((nota1 + nota2 + nota3)/3);
    }
}
