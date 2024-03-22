import java.util.Scanner;

public class aprovado_reprovado {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int notas[] = {0, 0}, freq=0;
        System.out.println("Insira a sua primeira nota:");
        notas[0] = entrada.nextInt();
        System.out.println("Insira a sua segunda nota:");
        notas[1] = entrada.nextInt();
        System.out.println("Insira a sua frequência (em %):");
        freq = entrada.nextInt();
        int media = (notas[0]+notas[1])/2;
        if(freq>=75 && media>=60){
            System.out.println("O aluno foi aprovado!");
        }
        else{
            System.out.println("O aluno foi reprovado!");
        }
        
    }
}
