package ex1_2;
public class Main {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);


        System.out.println("Caso estivesse vivo," + einstein.informaNome() + " teria " + einstein.informaIdade() + " anos.");
        System.out.println("Caso estivesse vivo," + newton.informaNome() + " teria " + newton.informaIdade() + " anos.");
    }
}
