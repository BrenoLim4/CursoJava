package br.com.abc.javacore.sobrecargadeMetodos;


import java.util.Scanner;

public class matrizesTest {

    public static void main(String[] args) {
        Matrizes matriz = new Matrizes();
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quantidade de linhas e colunas, respectvimante:");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        matriz.leitura(linha, coluna);
        System.out.println("\nAgora escolha um numero que esteja contido na matriz");
        int x = sc.nextInt();
        matriz.mostrarNumerosArredores(x);
    }
    
}
