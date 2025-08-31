package org.example.aulas.aula3;
//aula sobre modificadores de visibilidade
public class Caneta {
    public String modelo;
    public String cor;
    private Double ponta;
    protected Integer carga;
    private Boolean tampada;


    public void status(){
        System.out.println(("Uma caneta de cor " + cor + " e modelo " + modelo + " de ponta " + ponta +" e carga " +
                carga));
        System.out.println("Está tampada? " + tampada);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void rabiscar(){
        if(!this.tampada){
            System.out.println("Rabiscando");
        } else {
            System.out.println("ERRO AO RABISCAR");
        }
    }
}
