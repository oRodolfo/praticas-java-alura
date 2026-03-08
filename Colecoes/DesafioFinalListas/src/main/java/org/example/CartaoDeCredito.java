package org.example;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limiteConta;
    private double saldoConta;
    private List<Compra> compraList;

    public CartaoDeCredito(double limiteConta) {
        this.limiteConta = limiteConta;
        this.saldoConta = limiteConta;
        this.compraList = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldoConta > compra.getValor()){
            this.saldoConta -= compra.getValor();
            this.compraList.add(compra);
            return true;
        }

        return false;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }
}
