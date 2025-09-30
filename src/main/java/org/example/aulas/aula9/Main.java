package org.example.aulas.aula9;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.abrir();
        livro.titulo = "Protagonismo";
        System.out.println(livro.toString());
    }
}
