package org.example.aulas.aula4;

public class Aula4 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Bic Cristal", "Azul", 0.5);
//        caneta.setModelo("Bic Cristal");
//        caneta.modelo = "Bic Cristal";
        caneta.setPonta(0.5);
        caneta.status();
        System.out.println("Modelo:" + caneta.getModelo());
    }
}
