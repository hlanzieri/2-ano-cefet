import java.util.Arrays;
import java.util.Scanner;

public class sequencia {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.err.println("Insira a quantidade de vetores que o usuario deseja:");
        int x = entrada.nextInt();
        double n[] = new double[x];
        Arrays.fill(n, x);
        for(int i=0; i<x; i++){
        System.out.println("Insira o "+(i+1)+ "º número:");
        n[i] = entrada.nextDouble();
        }
        System.out.println("\nSequência inversa:\n");
        for(int i=x-1; i>=0; i--){
        System.out.println(+n[i]);
        }
        entrada.close();
    }
}
