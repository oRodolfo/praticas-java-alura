package org.example;

public class Verificando_Triangulo {


    public void CalculandoLados(String[] ladosTriangulos) {

        if(ladosTriangulos.length == 3){
            int lado1 = Integer.parseInt(ladosTriangulos[0]);
            int lado2 = Integer.parseInt(ladosTriangulos[1]);
            int lado3 = Integer.parseInt(ladosTriangulos[2]);

            if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
                System.out.println("Os lados podem formar um triangulo");
            }else{
                System.out.println("Os lados não podem formar um triangulo");
            }
        }
    }
}
