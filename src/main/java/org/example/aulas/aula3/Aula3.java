package org.example.aulas.aula3;

public class Aula3 {
    public static void main(String [] args){
        Caneta caneta = new Caneta();
        caneta.modelo = "BIC Cristal";
        caneta.cor = "preta";
        //caneta.ponta = 0.5;
        caneta.carga = 80;
        //caneta.tampada = true;
        caneta.destampar();
        caneta.status();
        caneta.rabiscar();


    }
}
