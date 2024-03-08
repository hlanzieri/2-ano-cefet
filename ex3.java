import java.util.Scanner;

public class ex3 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int ni = entrada.nextInt();
        System.out.println("Insira o segundo número:");
        int nf = entrada.nextInt();
        System.out.println("A seguir temos a sequência numérica:");
        if(ni>nf){
            for(int i=nf; i<ni; i++){
                System.out.println(+i);
            }
        }
        else{
            for(int i=ni;i<nf;i++){
                System.out.println(+i);
            }
        }
        entrada.close();
    }
}