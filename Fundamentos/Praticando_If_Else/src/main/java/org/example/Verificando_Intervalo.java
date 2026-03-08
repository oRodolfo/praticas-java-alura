package org.example;

public class Verificando_Intervalo {

    public void VerificandoIntervalo(double valorEmprestimo){
        if(valorEmprestimo >= 1000 && valorEmprestimo <= 5000){
            System.out.println("O valor R$" + valorEmprestimo + " esta do intervalo permitido e você foi contemplado");
        }else{
            System.out.println("O valor R$" + valorEmprestimo + " não está no intervalo permitido e você não foi contemplado");
        }
    }
}
