package trabalho_naval;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        /* Autor do projeto: Humberto de Moraes Lanzieri Filho */

        char aleatorio = ' ';

        int qt_p = 1;
        int qt_ta = 2;
        int qt_to = 3;
        int qt_s = 4;
        int menu = 0;
        int verificar = 0;
        int totalBarcos = 0;

        Mapa jogador = new Mapa();

        String[][] mapa1 = Mapa.main(args); 
        String[][] mapaPC = Mapa.main(args);

        Scanner leitor = new Scanner(System.in);
        
        do {

            System.out.println("Deseja posicionar seus navios aleatoriamente? S/N");
            aleatorio = leitor.next().charAt(0);

            if (aleatorio != 'S' && aleatorio != 'N')
                System.out.println("Digite apenas S ou N");

        } while (aleatorio != 'S' && aleatorio != 'N');

        if (aleatorio == 'S') {

            while (verificar != 1) {

                mapa1 = Mapa.Gerar(Mapa.main(args));
                Mapa.printar(mapa1);

                System.out.println("Deseja gerar outro mapa automaticamente? S/N");

                if (leitor.next().charAt(0) == 'S')
                    verificar = 0;
                else
                    verificar = 1;

            }

        } else if (aleatorio == 'N') {

            do {

                Mapa.printar(mapa1);
                jogador.lista(qt_p, qt_ta, qt_to, qt_s);

                System.out.print("Digite o ID do navio que deseja escolher: ");
                menu = leitor.nextInt();

                switch (menu) {

                    case 0:
                        if (qt_p == 0 && qt_ta == 0 && qt_to == 0 && qt_s == 0) {

                            menu = 0;
                        } else {

                            System.out.println("Ainda existem navios que podem ser utilizados!");
                            menu = 1;
                        }
                        break;

                    case 1:
                        if (qt_p != 0) {

                            mapa1 = Mapa.naviosUsuario(mapa1, menu, totalBarcos);
                            if (mapa1[14][32] == "0") {
                                totalBarcos++;
                                qt_p--;
                            }

                        } else {

                            System.out.println("Nao ha mais nenhum barco desse tipo!");

                        }
                        break;

                    case 2:
                        if (qt_ta != 0) {

                            mapa1 = Mapa.naviosUsuario(mapa1, menu, totalBarcos);
                            if (mapa1[14][32] == "0") {
                                totalBarcos++;
                                qt_ta--;
                            }

                        } else {

                            System.out.println("Nao ha mais nenhum barco desse tipo!");

                        }
                        break;

                    case 3:

                        if (qt_to != 0) {

                            mapa1 = Mapa.naviosUsuario(mapa1, menu, totalBarcos);
                            if (mapa1[14][32] == "0") {
                                totalBarcos++;
                                qt_to--;
                            }

                        } else {

                            System.out.println("Nao ha mais nenhum barco desse tipo!");

                        }
                        break;

                    case 4:

                        if (qt_s != 0) {

                            mapa1 = Mapa.naviosUsuario(mapa1, menu, totalBarcos);
                            if (mapa1[14][32] == "0") {
                                totalBarcos++;
                                qt_s--;
                            }

                        } else {

                            System.out.println("Nao ha mais nenhum barco desse tipo!");

                        }
                        break;

                    default:

                        System.out.println("Digite apenas numeros entre 0 e 4");
                        break;
                }

            } while (menu != 0);

        } else {

            System.out.println("digite apenas S ou N");

        }

        int ganhar = 0;

        String[][] mapa2 = Mapa.main(args);

        mapa1[12][32] = "1";
        mapaPC[12][32] = "0";

        mapa1[11][32] = "10";
        mapaPC[11][32] = "10";

        Mapa.Gerar(mapaPC);

        while (ganhar != 1 && ganhar != 2) {

            System.out.println("Seu mapa:");
            Mapa.printar(mapa1);

            System.out.println("Mapa do computador:");
            mapa2 = Mapa.NavioPC(mapaPC);
            Mapa.printar(mapa2);

            Atirar.Tiro(mapaPC);
            Atirar.Tiro(mapa1);

            if (Integer.valueOf(mapa1[11][32]) == 0)
                ganhar = 1;

            if (Integer.valueOf(mapaPC[11][32]) == 0)
                ganhar = 2;

        }

        if (ganhar == 2)
            System.out.println("VOCE GANHOU!!!!!!!!!!!!!! PARABENS!!!!!!!!!!!!!!!");
        else if (ganhar == 1)
            System.out.println("O COMPUTADOR GANHOU : (  MAIS SORTE NA PROXIMA VEZ!)");

        leitor.close();

    }

}
