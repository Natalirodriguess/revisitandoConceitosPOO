package org.example.aulas.aula5.exercicioprofessor;

public class Main {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumeroConta(1111);
        pessoa1.setDono("Jubileu");
        pessoa1.abrirConta("CC");
        pessoa1.depositar(100.0);

        ContaBanco pessoa2 =  new ContaBanco();
        pessoa2.setNumeroConta(2222);
        pessoa2.setDono("Creuza");
        pessoa2.abrirConta("CP");

        pessoa2.depositar(500.0);
        pessoa2.sacar(650.);
        pessoa2.fecharConta();

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();

    }
}
