package org.example;

public class Verificando_Desconto {

    public void AplicandoDesconto(double valorCompra){
        if(valorCompra >= 100.00){
            System.out.println("Desconto de 10% aplicado!");
            double valorDesconto = (valorCompra * 0.10);
            System.out.println("Valor Total: R$" + (valorCompra - valorDesconto));
        }else {
            System.out.println("Nenhum desconto aplicado!");
            System.out.println("Valor Total: R$" + valorCompra);
        }
    }
}
