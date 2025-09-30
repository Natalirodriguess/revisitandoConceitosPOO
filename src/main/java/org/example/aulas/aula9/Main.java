package org.example.aulas.aula9;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        Livro[] livros = new Livro[3];
        pessoas[0] = new Pessoa("Leitor um", 16, "F");
        pessoas[1] = new Pessoa("Leitor DOIS", 25, "M");
        livros[0] = new Livro("Protagonismo", "Desconhecido", 100, pessoas[1]);
        Livro livro = new Livro("Protagonismo", "Desconhecido", 100, pessoas[0]);
        System.out.println(livro.detalhe());
    }
}
