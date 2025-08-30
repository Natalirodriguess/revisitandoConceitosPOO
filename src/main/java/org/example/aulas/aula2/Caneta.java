package org.example.aulas.aula2;

public class Caneta {
    String modelo;
    String cor;
    Double ponta;
    Integer carga;
    Boolean tampada;


    public void status(){
        System.out.println(("Uma caneta de cor " + cor + " e modelo " + modelo + " de ponta " + ponta +" e carga " +
                carga));
        System.out.println("Está tampada? " + tampada);
    }

    public void tampar(){
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }

    public void rabiscar(){
        if(!tampada){
            System.out.println("Rabiscando");
        } else {
            System.out.println("ERRO AO RABISCAR");
        }
    }
}
