package org.example.aulas.aula2.exercicio.objeto_abstrato;

public class Casamento {
    String noivo;
    String noiva;
    String cerimonia;
    Boolean alianca;
    Boolean respostaCerimonia;
    Integer numeroConvidados;

    public void convidar(){
        System.out.println(numeroConvidados);
    }

    public void aceitarPedido(){
        if(respostaCerimonia){
            System.out.println("Coloquem as alianças");
            if(alianca){
                System.out.println("Alianças postas....");
                System.out.println("Pode beijar a noiva!");
            } else {
                System.out.println("Sem alianças...");
                System.out.println("Tragam as alianças!");
            }
        }else {
            System.out.println("Casamento cancelado!");
        }


    }
}
