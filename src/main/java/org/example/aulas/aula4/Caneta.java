package org.example.aulas.aula4;

public class Caneta {
    public String modelo;
    private Double ponta;
    private String cor;
    private  Boolean tampada;

    public Caneta(String modelo, String cor, Double ponta){
        this.tampar();
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setPonta(Double ponta){
        this.ponta = ponta;
    }

    public Double getPonta(){
        return this.ponta;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
