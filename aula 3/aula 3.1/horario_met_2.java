import java.util.Scanner;

public class horario_met_2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um tempo em segundos");
        int t = entrada.nextInt();
        int s = 0, min = 0, h = 0;
                h = t / 3600;
                min = (t % 3600) / 60;
                s = t % 60;
                System.out.println("Seu tempo foi de "+h+" h, "+min+" min e "+s+" seg");

        entrada.close();
    }
}
