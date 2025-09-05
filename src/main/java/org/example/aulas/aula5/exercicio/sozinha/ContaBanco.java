package org.example.aulas.aula5.exercicio.sozinha;

public class ContaBanco {

    public Integer numeroConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    public void abrirConta(String tipo){
        this.tipo = tipo;
        this.status = true;
        if(this.tipo == "CC"){
            this.saldo = 50.0;
        }else if(this.tipo == "CP"){
            this.saldo = 150.0;
        }
    }

    public String fecharConta(){
        String mensagem;
        if(!status){
            mensagem= "Conta já está fechada!";
        } else {
            if (saldo == 0) {
                this.status = false;
                mensagem = "Conta fechada com sucesso!";
            } else if (saldo > 0){
                mensagem = "Cliente possui saldo disponível.";
            } else {
                mensagem = "Cliente possui saldo devedor";
            }
        }
       return  mensagem;
    }

    public String pagarMensal(){
        String mensagem;
        Double mensalidade;
        if(this.tipo == "CC"){
            mensalidade = 12.0;
        } else { //erro na minha lógica, pois não captura o outro tipo de conta, mas sim qualquer outro valor
            mensalidade = 20.0;
        }

        if(status){
            if(saldo>= mensalidade){
                this.saldo = this.saldo - mensalidade;
                mensagem = "A mensalidade de valor " + mensalidade + " foi paga com sucesso!";
            } else {
                mensagem = "O cliente não possui saldo sufiente.";
            }
        }else {
            mensagem = "O cliente não possui conta ativa para deposito";
        }

        return mensagem;
    }

    public String sacar(Double valor){

        String mensagem;
        if(status){
            if(saldo>= valor){
                this.saldo = this.saldo - valor;
                mensagem = "O valor " + valor + " foi sacado com sucesso!";
            } else {
                mensagem = "O cliente não possui saldo sufiente.";
            }

        }else {
            mensagem = "O cliente não possui conta ativa para deposito";
        }

        return mensagem;
    }

    public String depositar (Double valor){
        String mensagem;

        if(this.status){
            this.saldo = this.saldo + valor;
             mensagem = "O valor " + valor + " foi depositado com sucesso!";
        }
        else {
            mensagem = "O cliente não possui conta ativa para depósito";
        }

        return mensagem;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
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
