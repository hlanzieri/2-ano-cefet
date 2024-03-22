import java.util.Scanner;

public class expressao {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número:");
        double n = entrada.nextDouble();
        double S = 0;
        for(int i = 1; i <= n; i++){
            double x = i;
            S+=1/x;
        }
        System.out.println("O valor da expressão S é "+S);
        entrada.close();
    }
}
