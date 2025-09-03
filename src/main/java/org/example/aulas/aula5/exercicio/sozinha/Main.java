package org.example.aulas.aula5.exercicio.sozinha;

public class Main {
    public static void main(String[] args) {
        ContaBanco contaBancoUm = new ContaBanco();
        contaBancoUm.numeroConta = 1245;
//        contaBancoUm.setStatus(false);
        contaBancoUm.abrirConta("CP");
        System.out.println("Saldo inicial é de: " + contaBancoUm.getSaldo());
        System.out.println(contaBancoUm.sacar(135.0));
        System.out.println(contaBancoUm.depositar(10.0));
        System.out.println(contaBancoUm.pagarMensal());
        System.out.println(contaBancoUm.fecharConta());
        System.out.println(contaBancoUm.getStatus());
        System.out.println("Saldo atual é de: " + contaBancoUm.getSaldo());

    }
}
