package trabalho_naval;

import java.util.Random;
import java.util.Scanner;

public class Mapa {

    public static String[][] main(String[] args) { // funcao que cria os mapas em branco

        String mapa[][] = new String[15][33];

        int cont = 0;

        for (char i = 'A'; i < 'O'; i++) { // faz a coluna de letras

            mapa[cont][0] = i + "";

            cont++;
        }

        for (int i = 0; i < 14; i++) {

            for (int j = 2; j < 32; j = j + 2) { // faz os espacos entre as colunas

                mapa[i][j] = "|";
            }
        }

        for (int i = 0; i < 15; i++) {

            for (int j = 1; j < 31; j = j + 2) {

                mapa[i][j] = "   "; // os espacos em branco da coluna
            }

        }

        for (int j = 0; j < 32; j = j + 2) { // os espacos entre os numeros

            mapa[14][j] = "   ";
        }

        for (int j = 22; j < 32; j = j + 2) {

            /*
             * usei isso pra arrumar a organizacao da lista, ja que so com o mesmo
             * espacamento entre os numeros o 14 ficava fora da lista
             */
            mapa[14][j] = "  ";

        }

        mapa[14][0] = "";
        mapa[14][2] = "   ";
        int cont2 = 1;

        for (int i = 3; i < 32; i = i + 2) { // linha de numeros

            mapa[14][i] = cont2 + "";

            if (cont2 > 14) // para n ficar printando nulo
                mapa[14][i] = "";
            else
                cont2++;

        }
        return mapa;
    }

    public static void printar(String mapa[][]) { // funcao usada apenas para printar os mapas

        for (int i = 0; i < 15; i++) {

            System.out.println();

            for (int j = 0; j < 31; j++) {

                System.out.print(mapa[i][j]);

            }

        }

        System.out.println("");
        System.out.println("--------------------------------------------------------------");

    }

    public static String[][] naviosUsuario(String[][] mapa, int num, int totalBarcos) { 
        
        // funcao do navio dos usuarios 

        Scanner leitor = new Scanner(System.in);

        char direcao = ' ';
        int verificar = 0;

        int tamanho = (num * -1) + 6; // usado para pegar o tamanho do barco

        String mapaUsuario[][] = mapa;

        mapaUsuario[14][32] = "0"; /*
                                    * usei para enviar junto com o mapa, evitando a necessidade de enviar os
                                    * valores de qt para esse metodo. 0 caso os navios forem colocados e
                                    * 1 caso o navio nao tenha sido colocado. se 0, quantidade de navios diminui,
                                    * caso contrario, nao.
                                    */

        mapaUsuario[13][32] = "0"; /*
                                    * usado para saber se o mapa sendo feito e automatizado ou nao, e caso
                                    * seja, as mensagens de erro aparecerao (ex: fora do mapa ). Tambem e usado
                                    * para atirar, se for 0, pedira pelos comandos do usuario, se for 1, sera
                                    * automatizado.
                                    */

        if (num != 0) {

            int casa[] = Atirar.casa(0); // metodo para pegar o valor das casas ( explicado mais nele)

            int valor_coluna = casa[0];
            int valor_linha = casa[1];

            System.out.println("Digite a direcao do navio (H para horizontal e V para vertical)");
            direcao = leitor.next().charAt(0);

            do {

                if (direcao != 'V' || direcao != 'H')
                    verificar = 1;
                if (direcao == 'V' || direcao == 'H')
                    verificar = 0;

                if (verificar != 0) {

                    System.out.println("Letra invalida, tente novamente! ( V ou H apenas maiusculo)");
                    direcao = leitor.next().charAt(0);
                }

            } while (verificar != 0);

            switch (num) {

                case 0:

                    break;

                case 1:

                    mapaUsuario = ColocarBarco(mapaUsuario, direcao, valor_coluna, valor_linha, num); //coloca os barcos
                    if (mapa[14][32] == "0") {
                        mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho; // usado na parte dos tiros, para comparar
                    }
                    break;

                case 2:

                    mapaUsuario = ColocarBarco(mapaUsuario, direcao, valor_coluna, valor_linha, num);
                    if (mapa[14][32] == "0") {
                        mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                    }
                    break;

                case 3:

                    mapaUsuario = ColocarBarco(mapaUsuario, direcao, valor_coluna, valor_linha, num);
                    if (mapa[14][32] == "0") {
                        mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                    }
                    break;

                case 4:

                    mapaUsuario = ColocarBarco(mapaUsuario, direcao, valor_coluna, valor_linha, num);
                    if (mapa[14][32] == "0") {
                        mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                    }
                    break;

                default:

                    System.out.println("Digite apenas valores indicados na lista!");

                    break;
            }

        }
        return mapaUsuario;
    }

    void lista(int qt_p, int qt_ta, int qt_to, int qt_s) {

        System.out.println("Lista de navios:");
        System.out.println("1: " + qt_p + " porta avioes ( 5x1 )");
        System.out.println("2: " + qt_ta + " navios tanque ( 4x1 )");
        System.out.println("3: " + qt_to + " contratorpedos ( 3x1 )");
        System.out.println("4: " + qt_s + " submarinos ( 2x1 )");
        System.out.println("0: Terminar a escolha ( so possivel quando todos os navios forem usados )");
        System.out.println("obs: a posicao sera a parte mais acima ou a esquerda do navio (dependendo da direcao)");
    }

    public static String[][] ColocarBarco(String mapa[][], char direcao, int valor_coluna, int valor_linha, int menu) {

        int verificar = 0;
        mapa[14][32] = "0"; /* usado para indicar se o navio foi colocado corretamente ou nao */

        int tamanho = (menu * -1) + 6; // usado para pegar o tamanho do barco

        int test = 0;
        int test2 = 0;

        if (direcao == 'V') {

            for (int j = 1; j > -2; j--) { /*
                                            * usei desses valores para o caso em que queira colocar o navio
                                            * diretamente embaixo, que deve ser impedido
                                            */

                if (valor_linha > 0) {

                    test = -1;
                    test2 = tamanho + 1;

                } else if (valor_linha == 0) { /*
                                                * caso a linha seja A, para que ele n tente ler o valor anterior ( -1 ),
                                                * que causaria um erro
                                                */

                    test = 0;
                    test2 = tamanho + 1;

                }

                if (valor_linha == 14 - tamanho) { /*
                                                    * caso a casa escolhida faca com que a ultima casa possivel seja
                                                    * preenchida, nao lendo o valor superior a 14
                                                    */

                    test = -1;
                    test2 = tamanho;

                }

                for (int i = test; i < test2; i++) {

                    if (valor_linha + i >= 14 || valor_coluna >= 32) {

                        if (mapa[13][32] == "0")
                            System.out.println("O lugar escolhido esta fora do mapa!");

                        mapa[14][32] = "1";
                        verificar = 1;
                        break;
                    }

                    if (mapa[valor_linha + i][valor_coluna + (j * 2)] == " * ") {

                        if (mapa[13][32] == "0")
                            System.out.println("O lugar escolhido está próximo demais de um navio!");

                        mapa[14][32] = "1";
                        verificar = 1;
                        break;
                    }
                    if (mapa[14][32] == "1")
                        break;

                }
            }

            if (verificar == 0) {

                for (int i = 0; i < tamanho; i++) {

                    mapa[valor_linha + i][valor_coluna] = " * ";

                }
            }
        } else if (direcao == 'H') {

            int test3 = -2;

            for (int i = 1; i > test3; i--) {

                if (valor_linha == 0) {

                    test3 = -1;
                }

                if (valor_linha > 0) {

                    test = -1;
                    test2 = tamanho;

                } else if (valor_linha == 0) {

                    test = -1;
                    test2 = tamanho;

                }

                for (int j = test; j <= test2; j++) {

                    if (valor_linha >= 14 || valor_coluna + (j * 2) > 32) {

                        if (mapa[13][32] == "0")
                            System.out.println("O lugar escolhido esta fora do mapa!");

                        mapa[14][32] = "1";
                        verificar = 1;
                        break;
                    }

                    if (mapa[valor_linha + i][valor_coluna + (j * 2)] == " * ") {

                        if (mapa[13][32] == "0")
                            System.out.println("O lugar escolhido está próximo demais de um navio!");

                        mapa[14][32] = "1";
                        verificar = 1;
                        break;
                    }

                }

                if (mapa[14][32] == "1")
                    break;

            }
            if (verificar == 0) {
                for (int i = 0; i < tamanho * 2; i = i + 2) {

                    mapa[valor_linha][valor_coluna + i] = " * ";

                }
            }
        }

        return mapa;

    }

    public static String[][] NavioPC(String[][] mapa) {

        // mostra apenas as casas que forem atiradas

        String[][] mapaVisto = Mapa.main(null);

        for (int i = 0; i < 14; i++) {

            for (int j = 0; j < 32; j++) {

                if (mapa[i][j] == " X " || mapa[i][j] == " O ")

                    mapaVisto[i][j] = mapa[i][j];

            }

        }

        return mapaVisto;
    }

    public static String[][] Gerar(String[][] mapa) {

        // contrapartida da barcos usuario, gera uma serie de numeros aleatorios e coloca barcos neles

        int qt_p = 1;
        int qt_ta = 2;
        int qt_to = 3;
        int qt_s = 4;
        int totalBarcos = 0;
        char direcao = ' ';

        mapa[13][32] = "1";

        Random r = new Random();

        mapa[14][32] = "0";

        int num = 1;

        while (qt_p != 0 || qt_ta != 0 || qt_to != 0 || qt_s != 0) {

            int tamanho = (num * -1) + 6;

            if (r.nextInt(2) == 0)
                direcao = 'V';
            else
                direcao = 'H';

            int valor_coluna = ((r.nextInt(14) + 1) * 2) + 1;
            int valor_linha = r.nextInt(14);

            if (direcao == 'V') {
                while (valor_linha + tamanho > 14) {

                    valor_linha--;
                }
            }

            if (direcao == 'H') {
                while (valor_coluna + tamanho > 32) {

                    valor_coluna--;
                }
            }

            switch (num) {

                case 1:

                    if (qt_p != 0) {
                        mapa = Mapa.ColocarBarco(mapa, direcao, valor_coluna, valor_linha, num);
                        if (mapa[14][32] == "0") {
                            mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                            totalBarcos++;
                            qt_p--;
                        }
                    } else
                        num = 2;
                    break;

                case 2:

                    if (qt_ta != 0) {
                        mapa = Mapa.ColocarBarco(mapa, direcao, valor_coluna, valor_linha, num);
                        if (mapa[14][32] == "0") {
                            mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                            totalBarcos++;
                            qt_ta--;
                        }
                    } else
                        num = 3;

                    break;

                case 3:

                    if (qt_to != 0) {
                        mapa = Mapa.ColocarBarco(mapa, direcao, valor_coluna, valor_linha, num);
                        if (mapa[14][32] == "0") {
                            mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                            totalBarcos++;
                            qt_to--;
                        }
                    } else
                        num = 4;

                    break;

                case 4:

                    if (qt_s != 0) {
                        mapa = Mapa.ColocarBarco(mapa, direcao, valor_coluna, valor_linha, num);
                        if (mapa[14][32] == "0") {
                            mapa[totalBarcos][32] = valor_linha + " " + valor_coluna + " " + direcao + " " + tamanho;
                            totalBarcos++;
                            qt_s--;
                        }
                    }
                    break;

            }
        }

        return mapa;

    }

}
