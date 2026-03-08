package org.example;

public class Verifica_Dia_Util {

    public void VerificandoDia(String diaSemana) {

        if (diaSemana.equals("segunda") || diaSemana.equals("terca") || diaSemana.equals("quarta") || diaSemana.equals("quinta") || diaSemana.equals("sexta")){
            System.out.println(diaSemana + " é dia util");
        }else{
            System.out.println(diaSemana + " não é dia util");
        }
    }
}
