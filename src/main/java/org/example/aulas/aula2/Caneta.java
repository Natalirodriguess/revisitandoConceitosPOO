package org.example.aulas.aula2;

public class Caneta {
    String modelo;
    String cor;
    Double ponta;
    Integer carga;
    Boolean tampada;


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
