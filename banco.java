import java.util.Scanner;

public class banco {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        char resp;
        while(true){
        System.out.println("Insira a opção que você gostaria de realizar:");
        System.out.println("(a) Consultar saldo;");
        System.out.println("(b) Realizar saque;");
        System.out.println("(c) Fazer depósito;");
        System.out.println("(d) Sair.");
        resp = entrada.next().charAt(0);
        if(resp == 'd'){
            break;
        }   
        switch(resp){
            case 'a': 
            System.out.println("O seu saldo é de R$" +saldo);
            break;
            case 'b':
            System.out.println("Insira quanto o sr/sra gostaria de sacar:");
            double saque = entrada.nextDouble();
            if(saque>saldo){
                System.out.println("Saldo insuficiente! Saque não pode ser realizado.");
            } else{
                saldo-=saque;
                System.out.println("O seu saque foi efetuado com sucesso! Seu saldo restante é de R$" +saldo);
            }
            break;
            case 'c':
            System.out.println("Insira quanto o sr/sra gostaria de depositar:");
            double deposito = entrada.nextDouble();
            saldo+=deposito;
            System.out.println("O seu depósito foi efetuado com sucesso! Seu saldo atual é de R$" +saldo);
            break;
        }
        }   
        System.out.println("Obrigado por usar nosso sistema de banco!d");
        entrada.close();
    }
}
