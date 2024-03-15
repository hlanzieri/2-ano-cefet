import java.util.Scanner;

public class pares{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int x=999, soma=0;
        while(x!=0){
        System.out.println("Insira um número:");
        x = entrada.nextInt();
        if(x%2==0){
            soma+=x;
        }
        System.out.println("Para sair digite 0.");
        }
        System.out.println("A soma dos pares é igual a " +soma);
        entrada.close();
        }
    }
    