import java.util.Scanner;

public class proj{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        while(true){
        System.out.println("Insira o primeiro número:");
        double n1 = entrada.nextDouble();
        System.out.println("Insira o segundo número:");
        double n2 = entrada.nextDouble();

		System.out.println("Insira qual tipo de operação iremos realizar:");
        System.out.println("1. Soma;");
        System.out.println("2. Subtração;");
        System.out.println("3. Multiplicação;");
        System.out.println("4. Divisão;");
        System.out.println("5. Sair.");
        int resp = entrada.nextInt();
        if(resp==5){
            break;
        }

        switch(resp){
            case 1: 
            System.out.println(n1 + n2);
            break;
            case 2:
            System.out.println(n1-n2);
            break;
            case 3:
            System.out.println(n1*n2);
            break;
            case 4:
            System.out.println(n1/n2);
        }
    }
	}
}