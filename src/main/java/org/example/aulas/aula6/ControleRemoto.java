package org.example.aulas.aula6;



public class ControleRemoto implements Controlador {
    private Integer volume;
    private Boolean ligado;
    private Boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public Integer getVolume(){
        return this.volume;
    }

    private void setVolume(Integer volume){
        this.volume = volume;
    }

    public Boolean getLigado(){
        return  this.ligado;
    }

    private void setLigado(Boolean ligado){
        this.ligado = ligado;
    }

    private Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    @Override //sobrescreve
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.print("Volume: " + getVolume());

        for(int i = 0; i <= getVolume(); i+= 10 ){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(ligado){
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("Impossível aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if(ligado){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() >0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(ligado && this.getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !(getTocando()) ){
            this.setTocando(true);
        }else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (getLigado() && (getTocando()) ){
            this.setTocando(false);
        }else {
            System.out.println("Não consegui pausar");
        }
    }
}
