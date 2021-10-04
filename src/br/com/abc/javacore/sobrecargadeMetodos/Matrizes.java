package br.com.abc.javacore.sobrecargadeMetodos;

import java.util.Random;

public class Matrizes {

    private int[][] matriz;

    public void leitura(int linha, int coluna) {
        matriz = new int[linha][coluna];
        Random gerador = new Random();//declaração de numero aleatorio
        for (int j = 0; j < linha; j++) {//laço para gerar numeros aleatorios para a matriz
            for (int i = 0; i < coluna; i++) {
                matriz[j][i] = gerador.nextInt(20 + 1);
            }
        }
        for (int j = 0; j < matriz.length; j++) {//mostrando a matriz
            if (j >= 1) {
                System.out.print("\n");//quebra de linha da matriz.
            }
            for (int i = 0; i < matriz[j].length; i++) {
                if (i < coluna) {
                    System.out.print(matriz[j][i] + "  ");
                }
            }
        }
    }

    public void mostrarNumerosArredores(int x) {
        for (int i = 0; i < matriz.length; i++) {//linha

            for (int j = 0; j < matriz[i].length; j++) {//coluna

                if (x == matriz[i][j]) {
                    System.out.printf("posição do numero %d [%d][%d]\n", x, i, j);
                    if (j > 0) {//j representa coluna se for maior que 0 significa que tem numero a esquerda
                        System.out.println("esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {//i representa linha, se for maior que 0 significa que tem numero acima
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {//se o j for menor que o quantidade de coluna-1, significa que tem numero a direita
                        System.out.println("direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {//se o i for menor que a quantidade de linhas-1, significa que tem numero abaixo.
                        System.out.println("abaixo: " + matriz[i + 1][j]);
                    }

                }
            }

        }
    }
}
