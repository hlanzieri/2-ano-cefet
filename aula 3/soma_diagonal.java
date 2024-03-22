import java.util.Scanner;

public class soma_diagonal {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int m[][] = {{0,0,0}, {0,0,0}, {0,0,0}}, i, j;
        for(i = 0 ; i <3; i++){
            for(j = 0; j<3; j++){
                System.out.println("Insira um número:");
                m[i][j] = entrada.nextInt();
            }
        }
        System.out.println("A matriz é:");
        for(i = 0 ; i <3; i++){
            for(j = 0; j<3; j++){
                System.out.print(+m[i][j]+" ");
            }
            System.out.println("");
        }
        int S1 = 0;
        j = 0;
        for(i = 0 ; i <3; i++){
            S1+=m[i][j];
            j++;
        }
        System.out.println("A soma da diagonal principal da matriz é: "+S1);
        int S2 = 0;
        j = 2;
        for(i = 0 ; i < 3; i++){
            S2+=m[i][j];
            j--;
        }
        System.out.println("A soma da diagonal secundária da matriz é: "+S2);
        entrada.close();
    }
}
