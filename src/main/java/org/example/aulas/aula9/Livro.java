package org.example.aulas.aula9;

public class Livro implements Publicacao{
    String titulo;
    String autor;
    Integer totalPaginas;
    Integer paginaAtual;
    Boolean aberto;
    Pessoa leitor;

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", paginaAtual=" + paginaAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    public Integer getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        System.out.println("Abrindo livro " +  this.titulo);
        aberto = true;
    }

    @Override
    public void fechar() {
        if (aberto) {
            System.out.println("fechando livro " +  this.titulo);
        }else {
            System.out.println("Erro ao fechar livro ");
        }
    }

    @Override
    public void avancarPag() {
        paginaAtual = paginaAtual + 1;
    }

    @Override
    public void voltarPag() {
        paginaAtual = paginaAtual - 1;
    }
}
