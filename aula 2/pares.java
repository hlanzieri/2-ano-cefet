import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 999, soma = 0, i = 0;
        while (x != 0) {
            System.out.println("Insira um número:");
            x = entrada.nextInt();
            if (x != 0 && x % 2 == 0) {
                soma += x;
                i++;
            }
            System.out.println("Para sair digite 0.");
        }
        if (i != 0) {
            double media = (double) soma / i;
            System.out.println("A média dos pares é igual a " + media);
        } else {
            System.out.println("Nenhum número par foi inserido.");
        }
        entrada.close();
    }
}
