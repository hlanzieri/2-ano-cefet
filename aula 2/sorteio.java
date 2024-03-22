import java.util.Random;
import java.util.Scanner;

public class sorteio {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(1, 11); 
        int y = r.nextInt(1, 11); 
        int soma = x+y;
        System.err.println("Insira o resultado da soma entre "+x+" e "+y+":");
        int inf = entrada.nextInt();
        if(inf==soma){
            System.out.println("Resultado da soma está correto!");
        }
        else{
            System.out.println("Resultado da soma está incorreto!");
        }
        entrada.close();
    }
}
