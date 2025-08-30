package org.example.aulas.aula2.exercicio.objeto_abstrato;


public class MainExercicio {

    public static void main(String[] args){
        Casamento casamento = new Casamento();
        casamento.noiva = "Luane";
        casamento.noivo = "Luan";
        casamento.respostaCerimonia = true;
        casamento.numeroConvidados = 30;
        casamento.cerimonia = "Ponposa";
        casamento.alianca = true;

        casamento.convidar();

        casamento.aceitarPedido();



        Casamento casamento2 = new Casamento();
        casamento2.noiva = "Roane";
        casamento2.noivo = "Roanaldo";
        casamento2.respostaCerimonia = true;
        casamento2.numeroConvidados = 31;
        casamento2.cerimonia = "Simples";
        casamento2.alianca = false;

        casamento2.convidar();

        casamento2.aceitarPedido();

    }

}
