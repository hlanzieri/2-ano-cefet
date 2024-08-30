package trabalho_naval;

import java.util.Random;
import java.util.Scanner;

public class Atirar {

    public static String[][] Tiro(String[][] mapa) {

        // metodo para atirar

        int verificar = 3;
        int dr = 0;

        char direcao = ' ';
        int[][] valores = new int[10][4];
        int g_c = 0;

        int totalBarcos = Integer.valueOf(mapa[11][32]);

        while (verificar == 3) {

            int casa[] = casa(Integer.valueOf(mapa[12][32]));

            int t_coluna = casa[0];
            int t_linha = casa[1];

            if (mapa[t_linha][t_coluna] == " * ") {

                verificar = 1;

                mapa[t_linha][t_coluna] = " O ";

                for (int i = 0; i < 10; i++) {

                    // toda essa parte que usa charAt e .valueOf pega a string que foi enviada pelo
                    // colocar barcos
                    direcao = mapa[i][32].charAt(mapa[i][32].length() - 3);

                    if (direcao == 'V')
                        valores[i][2] = 0;
                    else
                        valores[i][2] = 1;

                    String taman = mapa[i][32].substring(mapa[i][32].length() - 1, mapa[i][32].length());

                    valores[i][3] = Integer.valueOf(taman);

                    if (mapa[i][32].length() == 7) {

                        String linha = mapa[i][32].substring(0, 1);
                        valores[i][0] = Integer.valueOf(linha);

                        String coluna = mapa[i][32].substring(2, 3);
                        valores[i][1] = Integer.valueOf(coluna);

                    } else if (mapa[i][32].length() == 8) {

                        if (mapa[i][32].charAt(2) == ' ') {

                            String linha = mapa[i][32].substring(0, 2);
                            valores[i][0] = Integer.valueOf(linha);

                            String coluna = mapa[i][32].substring(3, 4);
                            valores[i][1] = Integer.valueOf(coluna);

                        } else {

                            String linha = mapa[i][32].substring(0, 1);
                            valores[i][0] = Integer.valueOf(linha);

                            String coluna = mapa[i][32].substring(2, 4);
                            valores[i][1] = Integer.valueOf(coluna);

                        }

                    } else if (mapa[i][32].length() == 9) {

                        String linha = mapa[i][32].substring(0, 2);
                        valores[i][0] = Integer.valueOf(linha);

                        String coluna = mapa[i][32].substring(3, 5);
                        valores[i][1] = Integer.valueOf(coluna);

                    }

                    // essa parte e usada para saber a direcao do barco em que se atirou e, quando
                    // achar, ver qual e esse barco de acordo com os valores que foram salvos

                    if (mapa[t_linha + 1][t_coluna] == " * " || mapa[t_linha + 1][t_coluna] == " O ")
                        dr = 0;

                    if (t_linha - 1 >= 0)
                        if (mapa[t_linha - 1][t_coluna] == " * " || mapa[t_linha - 1][t_coluna] == " O ")
                            dr = 1;

                    if (mapa[t_linha][t_coluna + 2] == " * " || mapa[t_linha][t_coluna + 2] == " O ")
                        dr = 2;

                    if (mapa[t_linha][t_coluna - 2] == " * " || mapa[t_linha][t_coluna - 2] == " O ")
                        dr = 3;

                    for (int j = 0; j < 4; j++) {

                        if (dr == 0 && t_linha + j >= 15)
                            continue;

                        else if (dr == 1 && t_linha - j < 0)
                            continue;

                        else if (dr == 2 && t_coluna + (2 * j) >= 33)
                            continue;

                        else if (dr == 3 && t_coluna - (2 * j) < 0)
                            continue;

                        if (dr == 0) {

                            if (mapa[t_linha + j][t_coluna] == " * " || mapa[t_linha + j][t_coluna] == " O ") {

                                if (t_linha + j == valores[i][0] && t_coluna == valores[i][1]) {

                                    g_c = i;
                                    verificar = 2;
                                    break;
                                }

                            }

                        } else if (dr == 1) {

                            if (mapa[t_linha - j][t_coluna] == " * " || mapa[t_linha - j][t_coluna] == " O ") {

                                if (t_linha - j == valores[i][0] && t_coluna == valores[i][1]) {

                                    g_c = i;
                                    verificar = 2;
                                    break;
                                }

                            }

                        } else if (dr == 2) {

                            if (mapa[t_linha][t_coluna + (2 * j)] == " * "
                                    || mapa[t_linha][t_coluna + (2 * j)] == " O ") {

                                if (t_linha == valores[i][0] && t_coluna + (2 * j) == valores[i][1]) {

                                    g_c = i;
                                    verificar = 2;
                                    break;
                                }

                            }

                        } else if (dr == 3) {

                            if (mapa[t_linha][t_coluna - (2 * j)] == " * "
                                    || mapa[t_linha][t_coluna - (2 * j)] == " O ") {

                                if (t_linha == valores[i][0] && t_coluna - (2 * j) == valores[i][1]) {

                                    g_c = i;
                                    verificar = 2;
                                    break;
                                }

                            }

                        }

                    }

                    if (verificar == 2)
                        break;

                }

                for (int i = 0; i < valores[g_c][3]; i++) {

                    // ve se o barco ja foi explodido por completo

                    if (valores[g_c][2] == 0) {

                        if (mapa[valores[g_c][0] + i][valores[g_c][1]] == " * ") {

                            verificar = 1;
                            break;

                        } else if (mapa[valores[g_c][0] + i][valores[g_c][1]] == " O ")
                            verificar = 0;

                    } else if (mapa[valores[g_c][0]][valores[g_c][1] + (i * 2)] == " * ") {

                        verificar = 1;
                        break;

                    } else if (mapa[valores[g_c][0]][valores[g_c][1] + (i * 2)] == " O ")
                        verificar = 0;

                }
                int test = -1;
                int test2 = valores[g_c][3];
                int test3 = -2;

                if (verificar == 0) {

                    for (int j = 1; j > test3; j--) {

                        if (valores[g_c][0] == 0) {

                            if (valores[g_c][2] == 0) {
                                test = 0;
                                test2 = valores[g_c][3];
                            } else
                                test3 = -1;
                        }

                        if (valores[g_c][2] == 0)
                            if (valores[g_c][0] == 14 - valores[g_c][3])
                                test2 = valores[g_c][3] - 1;

                        if (valores[g_c][2] == 0) {
                            if (valores[g_c][1] == 29 && j == 1)
                                j = 0;
                        } else {
                            if (valores[g_c][1] + valores[g_c][3] >= 31)
                                test2 = valores[g_c][3] - 1;

                        }

                        for (int i = test; i <= test2; i++) {
                            // faz a area explodida em volta d barco
                            if (valores[g_c][2] == 0) {

                                if (valores[g_c][1] + (j * 2) != 1)
                                    if (mapa[valores[g_c][0] + i][valores[g_c][1] + (j * 2)] == "   ")
                                        mapa[valores[g_c][0] + i][valores[g_c][1] + (j * 2)] = " X ";
                            } else {

                                if (valores[g_c][1] + (i * 2) != 1)
                                    if (mapa[valores[g_c][0] + j][valores[g_c][1] + (i * 2)] == "   ")
                                        mapa[valores[g_c][0] + j][valores[g_c][1] + (i * 2)] = " X ";
                            }

                        }
                    }
                    totalBarcos--; // condicao de vitoria, quando chega a 0
                    mapa[11][32] = totalBarcos + "";
                }

            } else if (mapa[t_linha][t_coluna] == "   ") {

                mapa[t_linha][t_coluna] = " X ";
                verificar = 1;

            } else {

                System.out.println("Essa casa ja foi atirada, tente novamente!!");
                verificar = 3;
            }

        }

        return mapa;
    }

    public static int[] casa(int escolha) {

        Scanner leitor = new Scanner(System.in);
        Random r = new Random();

        int result[] = new int[2];
        char linha = ' ';
        int coluna = 0;
        int valor_linha = 0;

        if (escolha == 0) {
            int verificar = 0;

            System.out.println("Digite a casa escolhida:");

            while (verificar == 0) {

                String casa = new String();

                casa = leitor.next();

                linha = casa.charAt(0);
                int tamanho = casa.length();

                if (tamanho == 2) {

                    String numeros = casa.substring(1, 2);
                    coluna = Integer.valueOf(numeros);
                    verificar = 1;

                } else if (tamanho == 3) {

                    String numeros = casa.substring(1, 3);
                    coluna = Integer.valueOf(numeros);
                    verificar = 1;

                } else {

                    System.out.println("Digite apenas a coluna e a linha");
                    verificar = 0;
                    continue;

                }

                for (char i = 'A'; i < 'O'; i++) {

                    if (linha != i) {

                        verificar = 0;

                    } else if (linha == i) {

                        verificar = 1;
                        break;
                    }
                }

                if (verificar == 0) {
                    System.out.println("Letra invalida, tente novamente! ( A a N apenas maiusculo )");
                    continue;
                }

                for (int i = 1; i < 15; i++) {

                    if (coluna != i) {

                        verificar = 0;
                    } else if (coluna == i) {

                        verificar = 1;
                        break;

                    }
                }
                if (verificar == 0) {

                    System.out.println("Numero invalido, tente novamente! ( 1 a 14 )");
                    continue;
                }

            }

            valor_linha = (linha - '0') - 17;/*
                                              * 17 é o valor de 'A' na tabela ASCII, portanto ao fazer isso o valor
                                              * de
                                              * A será 0, B será 1, etc, condizendo com a matriz
                                              */

        } else {

            coluna = r.nextInt(1, 15);
            valor_linha = r.nextInt(14);

        }

        int valor_coluna = ((coluna) * 2) + 1;/*
                                               * sao esses numeros ai porque tem o espaco das letras (0), um espaco
                                               * depois disso (1), e metade do resto sao as linhas |
                                               */

        result[0] = valor_coluna;
        result[1] = valor_linha;

        return result;
    }

}
