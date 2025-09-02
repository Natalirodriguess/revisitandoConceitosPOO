package org.example.aulas.aula4.exercicio;

public class Gato {

    String nome;
    Double peso;
    String cor;
    Integer numeroDePatas;
    String petiscoPreferido;
    Boolean acordado;
    Boolean fome;

    public Gato (String nome, Double peso,String cor, Integer numeroDePatas,
                 String petiscoPreferido, Boolean acordado, Boolean fome){
        setNome(nome);
        setPeso(peso);
        setCor(cor);
        setNumeroDePatas(numeroDePatas);
        setPetiscoPreferido(petiscoPreferido);
        setAcordado(acordado);
        setFome(fome);
    }

    public void caracteristicas(){
        System.out.println("Nome:" + getNome());
        System.out.println("Peso:" + getPeso());
        System.out.println("Cor:" + getCor());
        System.out.println("Numero De Patas:" + getNumeroDePatas());
        System.out.println("Petisco Preferido:" + getPetiscoPreferido());
        System.out.println("Acordado:" + getAcordado());
        System.out.println("Fome:" + getFome());
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(Integer numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getPetiscoPreferido() {
        return petiscoPreferido;
    }

    public void setPetiscoPreferido(String petiscoPreferido) {
        this.petiscoPreferido = petiscoPreferido;
    }

    public Boolean getAcordado() {
        return acordado;
    }

    public void setAcordado(Boolean acordado) {
        this.acordado = acordado;
    }

    public Boolean getFome() {
        return fome;
    }

    public void setFome(Boolean fome) {
        this.fome = fome;
    }
}
