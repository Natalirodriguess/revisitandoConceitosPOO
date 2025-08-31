package org.example.aulas.aula3.testesVisibilidade;

import org.example.aulas.aula3.Caneta;

public class ClasseEmOutroPacote extends Caneta{

    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        //caneta.carga = 80; //objeto externo fora do pacote da classe mãe

        ClasseEmOutroPacote classeEmOutroPacote = new ClasseEmOutroPacote();
        classeEmOutroPacote.carga = 95;
        System.out.println(classeEmOutroPacote.carga);
    }
}
