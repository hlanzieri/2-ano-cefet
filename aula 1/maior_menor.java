import java.util.Scanner;

public class maior_menor {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o 1° número:");
        Double x = entrada.nextDouble();
        System.out.println("Insira o 2° número:");
        Double y = entrada.nextDouble();
        if(x>y){
            System.out.println("O maior dos dois números é "+x);
        }
        else{
            System.out.println("O maior dos dois números é "+y);
        }
        entrada.close();
    }
}
