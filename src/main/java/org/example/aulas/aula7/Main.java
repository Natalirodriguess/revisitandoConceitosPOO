package org.example.aulas.aula7;

public class Main {
    public static void main(String[] args) {
        
        Lutador [] lutadores = new Lutador[6];
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("Dead code", "Austália", 28, 1.93, 81.6, 13, 0, 2);
//        lutadores[4] = new Lutador("");
//        lutadores[5] = new Lutador("");
        lutadores[0].apresentar();
        lutadores[2].status();
        lutadores[1].ganharLuta();
        lutadores[0].empatarLuta();

    }
}
