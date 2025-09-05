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
        setStatus(true);
        if(this.tipo == "CC"){
            this.saldo = 50.0;
        }else if (this.tipo == "CP"){
            this.saldo = 150.0;
        }
    }

    public void depositar(Double valor){
        if(status){
            setSaldo(getSaldo() + valor);
        } else{
            System.out.println("Impossível sacar");
        }

    }

    public void sacar(Double valor){
        if(status){
            if(saldo> valor) {
                saldo = saldo - valor;
            }else {
                System.out.println("Saldo insuficiente.");
            }
        }else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        Double valor = 0.0;

        if(this.tipo == "CC"){
            valor = 12.0;
        } else if (this.tipo == "CP"){ //por conta desse caminho específico, a variável valor precisa ser inicializada
            valor = 20.0;
        }

        if (status){
            if(saldo > valor){
                saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossível pagar");
        }
    }

    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Conta com dinheiro!");
        } else if (this.saldo < 0){
            System.out.println("Conta está em débito");
        }else {
            setStatus(false);
        }
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
