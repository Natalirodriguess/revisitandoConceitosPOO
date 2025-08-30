package org.example.aulas.aula2.exercicio.objeto_concreto;

public class MainExercicio {

    public static void main(String[] args){
        Teclado tecladoRedDr = new Teclado();
        tecladoRedDr.botoes ="Alfa numerico";
        tecladoRedDr.funcional = true;
        tecladoRedDr.cor = "Vermelho e preto";
        tecladoRedDr.marca = "Redragon";
        tecladoRedDr.ligar();
        tecladoRedDr.digitar();

        Teclado tecladoRedDr2 = new Teclado();
        tecladoRedDr2.botoes ="Alfa numerico";
        tecladoRedDr2.funcional = false;
        tecladoRedDr2.cor = "Branco e preto";
        tecladoRedDr2.desligar();
        tecladoRedDr2.digitar();
    }

}
