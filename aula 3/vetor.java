import java.util.Scanner;

public class vetor {
    public static void main(String args[]){
        int vetor[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < 10; i++){
            if(i%2==0){
                vetor[i]=2;
            }
            else{
                vetor[i]=1;
            }
        }
        System.out.println("Impressão do vetor:");
        for(int i = 0; i < 10; i++){
            if(i==0){
                System.out.print(+vetor[i]);
            }
            else{
            System.out.print(", "+vetor[i]);
            }
        }
        System.out.println("");
    }
}
