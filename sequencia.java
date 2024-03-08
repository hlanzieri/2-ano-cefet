import java.util.Arrays;
import java.util.Scanner;

public class sequencia {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double n[] = new double[10];
        Arrays.fill(n, 0);
        for(int i=0; i<10; i++){
        System.out.println("Insira o "+(i+1)+ "º número:");
        n[i] = entrada.nextDouble();
        }
        System.out.println("\nSequência inversa:\n");
        for(int i=9; i>=0; i--){
        System.out.println(+n[i]);
        }
        entrada.close();
    }
}
