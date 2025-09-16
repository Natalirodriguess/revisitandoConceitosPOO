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
            this.desafiado = desafiado;
            this.desafiante = desafiante;
            System.out.println("Luta marcada!");
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Erro ao marcar luta.");
        }
    }

    public void lutar(){
    
        if(aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            Random numeroAleatorio = new Random();
            Integer vencedor = numeroAleatorio.nextInt(3);

            System.out.println("===========RESULTADO DA LUTA=============");
            switch (vencedor){
                case 0:
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println("=============================");
                    System.out.println("Houve empate!");
                    break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("=============================");
                    System.out.println("O vencedor é o " + desafiado.getNome());
                    break;
                case 2:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("=============================");
                    System.out.println("O vencedor é o " + desafiante.getNome());
            }
            System.out.println("============================");
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
