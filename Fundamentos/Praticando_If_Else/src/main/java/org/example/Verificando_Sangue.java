package org.example;

public class Verificando_Sangue {

    public void VerificandoCompatibilidade(int idade, double peso){
        if(idade >= 18 && peso > 50.00){
            System.out.println("O doador atende as espeficicações de ter entre 18 e 65 anos e pesar mais de 50 kg.");
        } else if (idade < 18 && peso > 50.00) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos");
        }else{
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter mais de 50.00kg");
        }
    }
}
