package ex10;

public class Main {
    public static void main(String[] args) {
        
        Pessoa avo_masc_Paterno = new Pessoa("Miguel Lúcio", 84);
        Pessoa avo_fem_Paterno = new Pessoa("Maria Rita", 84);
        Pessoa avo_masc_Materna = new Pessoa("Odilon", 80);
        Pessoa avo_fem_Materna = new Pessoa("Francisca", 84);
    
        Pessoa pai = new Pessoa("Humberto", 50, avo_masc_Paterno, avo_fem_Paterno);
        Pessoa mae = new Pessoa("Karina", 44, avo_masc_Materna, avo_fem_Materna);
        Pessoa filho = new Pessoa("Humberto Filho", 26, pai, mae);

        System.out.println("Árvore Genealógica de " + filho.getNome() + ":");
        System.out.println(filho.descricaoArvoreGenealogica());

        System.out.println("\nÁrvore Genealógica de " + pai.getNome() + ":");
        System.out.println(pai.descricaoArvoreGenealogica());

        System.out.println("\nÁrvore Genealógica de " + mae.getNome() + ":");
        System.out.println(mae.descricaoArvoreGenealogica());
    }
}

