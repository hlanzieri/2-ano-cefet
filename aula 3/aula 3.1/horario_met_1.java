import java.util.Scanner;

public class horario_met_1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um tempo em segundos");
        int t = entrada.nextInt();
        if(t<60){
            System.out.println("O tempo foi de "+t+" segundos.");
        }
        else{
            if(t<3600){
                int min = t/60;
                int s = t - (60*t);
                System.out.println("Seu tempo foi de "+min+" min e "+s+" seg");
            }
            else{
                int h = t/3600;
                int min = t - (3600*h);
                int s = t - (3600*h) - (60*min);
                System.out.println("Seu tempo foi de "+h+" h, "+min+" min e "+s+" seg");
            }
        }
        entrada.close();
    }
}
