import java.util.Scanner;

public class fatorial {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int fat=0;
        System.out.println("Insira o número:");
        int n = entrada.nextInt();
        if(n==0){
            System.out.println("O fatorial de 0 é 1");
        }
        else{
            for(int i=1;i<n;i++){
                if(i==1){
                    fat= n*(n-i);
                }
                else{
                    fat=fat*(n-i);
                }
            }
            System.out.println("O fatorial de "+n+" é 5" +fat);
        }
        entrada.close();
    }
}
