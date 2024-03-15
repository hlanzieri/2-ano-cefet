import java.util.Scanner;

public class matriz {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        char m[][]={{*, *, *, *, *}, {*, *, *, *, *}, {*, *, *, *, *}, {*, *, *, *, *}};
        for(int vet: m){
            for(int element:vet){
                System.out.println(element+ " ");
                System.out.println();
            }
        }
        entrada.close();
    }
}
