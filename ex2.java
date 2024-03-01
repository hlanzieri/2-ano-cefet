import java.util.Scanner;

public class ex2{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        while(true){
        System.out.println("Insira  um número positivo:");
        double n = entrada.nextDouble();
        if(n > 0){
            System.out.println("O número é positivo.");
            break;
        } else{
            System.out.println("O número é negativo, insira um número positivo.");
        }
        }
    }
}
