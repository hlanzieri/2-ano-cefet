import java.util.Scanner;

public class status_aluno {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int notas[] = {0, 0, 0};
        System.out.println("Insira a sua primeira nota:");
        notas[0] = entrada.nextInt();
        System.out.println("Insira a sua segunda nota:");
        notas[1] = entrada.nextInt();
        System.out.println("Insira a sua terceira nota:");
        notas[2] = entrada.nextInt();
        int soma = 0;
        for(int i = 0; i < 3; i++){
            soma+=notas[i];
        }
        double s2 = soma;
        double media = s2/3;
        if(media>6){
            System.out.println("Aprovado!");
        }
        else{
            if(media>4){
                System.out.println("Verificação Suplementar!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
        entrada.close();
    }
}
