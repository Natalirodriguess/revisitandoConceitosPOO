package org.example.aulas.aula2;

public class Aula2 {
    public static void main(String [] args){
        Caneta caneta = new Caneta();
        caneta.cor = "azul";
        caneta.ponta = 0.5;
        caneta.modelo = "BIC MOD";
        caneta.carga = 90;
        caneta.tampada = false;
        caneta.status();
        caneta.destampar();
        caneta.rabiscar();

        Caneta caneta1 = new Caneta();
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();


    }
}
