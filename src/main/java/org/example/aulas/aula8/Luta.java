package org.example.aulas.aula8;

import java.util.Random;

//um lutador disputa uma luta
public class Luta {
    private Lutador desafiado; //aqui será criada a relação de agregação
    private Lutador desafiante;
    private Integer rounds;
    private Boolean aprovada;

    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if(desafiado.getCategoria() == desafiante.getCategoria()
        && desafiado != desafiante){
            this.aprovada = true;
            System.out.println("Luta marcada!");
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Erro ao marca luta.");
        }
    }

    public void lutar(){
        Random numeroAleatorio = new Random();
        Integer vencedor;
        if(aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            vencedor = numeroAleatorio.nextInt(0, 3);
            switch (vencedor){
                case 0:
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println("=============================");
                    System.out.println("Houve empate!");
                    break;
                case 1:
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("=============================");
                    System.out.println("O vencedor é o " + desafiado.getNome());
                    break;
                case 2:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("=============================");
                    System.out.println("O vencedor é o " + desafiante.getNome());
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
