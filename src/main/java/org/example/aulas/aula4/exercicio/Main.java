package org.example.aulas.aula4.exercicio;

public class Main {

    public static void main(String [] args){
        Gato gatoSaphira = new Gato("Saphira", 5.0, "Branca e marrom", 4,
                "Ração seca", true, true);
        System.out.println("Gato 1: ");
        gatoSaphira.caracteristicas();
    }
}
