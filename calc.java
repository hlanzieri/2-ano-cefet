import java.util.Scanner;

public class bask{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("A seguir insira os coeficientes da sua equação:");
        System.out.println("Insira 'a':");
        double a = entrada.nextDouble();
        System.out.println("Insira 'b':");
        double b = entrada.nextDouble();
        System.out.println("Insira 'c':");
        double c = entrada.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Possui duas raízes reais e iguais.");
            System.out.println("O valor de X é " + (-b + Math.sqrt(delta)) / (2 * a));
        } else {
            System.out.println("Possui duas raízes reais diferentes.");
            System.out.println("X pode assumir " + ((-b + Math.sqrt(delta)) / (2 * a)) + " ou " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }
	}
}