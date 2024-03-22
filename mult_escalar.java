import java.util.Scanner;

public class status_aluno {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int i=0, N=0;
        System.out.println("Insira o tamanho do vetor:");
        N = entrada.nextInt();
        int M[N];
        System.out.println("Insira "+N+" números em ordem crescente para preencher o vetor:");
        while(i<N){
            System.out.println("Insira o "+(i+1)+"° número:");
            M[i] = entrada.nextInt();
            i++;
        }
        System.out.println("Vetor preenchido!");
        System.out.println("Insira um número:");
        int x = entrada.nextInt();
        for(i=0; i<N; i++){
            int y=0;
            y=x*M[i];
            System.out.println("A multiplicação do "+(i+1)+"° número com o escalar é igual a "+y);
        }
        entrada.close();
    }
}
