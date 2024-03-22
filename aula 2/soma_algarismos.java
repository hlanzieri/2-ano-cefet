import java.util.Scanner;

public class soma_algarismos {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número:");
        int numero = entrada.nextInt();
        int soma=0;
    for(int i = 0; i < numero ; i++){
        int unidade = numero % 10;
        if(numero>=10){
        numero /= 10;
        }
        soma += unidade;
    }
    System.out.println("A soma dos algarismos do número "+numero+" é " +soma);
    entrada.close();
}
}
