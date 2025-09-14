package org.example.aulas.aula7;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    public Lutador(String nome, String nacionalidade, Integer idade, Double altura, Double peso, Integer vitorias, Integer derrotas, Integer empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso); //qual a diferença?
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Lutador : " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println("Pesando: " + getPeso() + "kg");
        System.out.println("Ganhou: " + getVitorias() + " lutas");
        System.out.println("Perdeu: " + getDerrotas() + " lutas");
        System.out.println("Empatou: " + getEmpates() + " lutas");

    }

    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() - 1);
    }

    public void empatarLuta(){
        empates = empates + 1;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(Double peso) {

        if(peso < 52.2){
            categoria = "Inválido - abaixo do peso";
        } else if ( peso <= 70.3){
            categoria = "Leve";
        } else if (peso <= 83.9){
            categoria = "Peso médio";
        } else if (peso <= 120.2){
            categoria = "Peso pesado";
        } else {
            categoria = "Inválido - acima do peso";
        }

    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
}
