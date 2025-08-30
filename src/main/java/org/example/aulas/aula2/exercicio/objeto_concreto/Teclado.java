package org.example.aulas.aula2.exercicio.objeto_concreto;

public class Teclado {

    String botoes;
    String marca;
    Boolean ligado;
    String cor;
    Boolean funcional;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void digitar(){
        if(ligado && funcional){
            System.out.println("Digitando");
        } else if(!ligado) {
            System.out.println("Ligue o teclado");
        } else {
            System.out.println("Erro ao digitar!");
        }
    }
}
