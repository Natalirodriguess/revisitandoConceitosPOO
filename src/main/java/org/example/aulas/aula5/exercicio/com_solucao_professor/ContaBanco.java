package org.example.aulas.aula5.exercicio.com_solucao_professor;

public class ContaBanco {

    public Integer numeroConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    public ContaBanco(){
        this.saldo = 0.0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroConta(){
        return this.numeroConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono (){
        return this.dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
