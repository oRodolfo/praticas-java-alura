package org.example;

public class Consumo_Autonomia {

    double consumoMedio;
    double capacidadeTanque;
    double combustivelAtual;
    double distanciaViagem;

    public Consumo_Autonomia(double consumoMedio, double capacidadeTanque, double combustivelAtual, double distanciaViagem) {
        this.consumoMedio = consumoMedio;
        this.capacidadeTanque = capacidadeTanque;
        this.combustivelAtual = combustivelAtual;
        this.distanciaViagem = distanciaViagem;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public Consumo_Autonomia setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
        return this;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public Consumo_Autonomia setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
        return this;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public Consumo_Autonomia setCombustivelAtual(double combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
        return this;
    }

    public double getDistanciaViagem() {
        return distanciaViagem;
    }

    public Consumo_Autonomia setDistanciaViagem(double distanciaViagem) {
        this.distanciaViagem = distanciaViagem;
        return this;
    }

    public void AutonomiaCarro(){
        double autonomiaMaxima = (consumoMedio * capacidadeTanque);
        double autonomiaAtual = (consumoMedio * combustivelAtual);

        if(autonomiaAtual >= distanciaViagem){
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }else{
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }
    }
}
