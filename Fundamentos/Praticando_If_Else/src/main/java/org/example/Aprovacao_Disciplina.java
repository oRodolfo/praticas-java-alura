package org.example;

public class Aprovacao_Disciplina {

    public void VerificandoAprovacao(double nota){
        if(nota <= 10.0){
            System.out.println("O estudante teve uma média de " + nota + " e foi aprovado na materia");
        } else if (nota <= 6.9) {
            System.out.println("O estudante teve uma média de " + nota + " e está de recuperação na materia");
        }else{
            System.out.println("O estudante teve uma média de " + nota + " e está reprovado na materia");
        }
    }
}
