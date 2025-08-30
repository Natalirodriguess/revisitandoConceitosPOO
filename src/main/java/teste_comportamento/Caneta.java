package teste_comportamento;

public class Caneta {

    private String cor;
    private String modelo;
    private Double ponta;
    String marca;
    Boolean tampada;

    public Caneta(){
        this.cor = "Azul";
        this.modelo = "Bic 2025";
        this.ponta = 0.50;
        this.marca = "BIC";
        this.tampada = false;
    }

    public String getCor(){
        return this.cor;
    }

//    public Caneta(String cor, String modelo,Double ponta,String marca,Boolean tampada){
//
//    }
}
