import java.util.Scanner;

public class ex {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    System.out.println("Insira a quantidade de produtos comprados:");
    int qtd = entrada.nextInt();
    System.out.println("Insira o preço unitário do produto:");
    double cost = entrada.nextDouble();
    if(qtd*cost<100){
        double prc=qtd*cost*0.95;
        System.out.println("A sua compra ficou em R$" +prc);
    }
    else{
        if(qtd*cost>=100 && qtd*cost<=1000){
            double prc=qtd*cost*0.95;
            System.out.println("Parabéns você ganhou 5% de cash back para uma compra futura!");
            System.out.println("A sua compra ficou em R$" +prc);
        }
        else{
            double prc=qtd*cost*0.9;
            System.out.println("Parabéns você ganhou 7% de cash back para uma compra futura!");
            System.out.println("A sua compra ficou em R$" +prc);
        }
    }
}
}
