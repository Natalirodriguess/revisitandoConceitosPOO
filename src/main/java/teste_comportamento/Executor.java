package teste_comportamento;

public class Executor {
    public static void main(String[] args) {
        Caneta canetaUm = new Caneta();
        Caneta canetaDois = new Caneta();
        Caneta canetaTres = new Caneta();
        Caneta canetaQuatro = new Caneta();

        canetaUm.marca = "SEM ENCAPSULAMENTO";
        System.out.println(canetaUm.marca);

        System.out.println("Caneta um: "+ canetaUm.getCor());

        System.out.println("Caneta dois: "+canetaDois.getCor());
    }
}
