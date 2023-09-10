package com.mycompany.app.PCC.atv2;

import java.util.Scanner;

/**
 * Proponha um algoritmo que leia a ordem n (1 n 15 e n é ímpar) de uma matriz
 * A, e
 * faça o preenchimento desta conforme o exemplo a seguir, para n = 5:
 * 
 * - - * - -
 * - * * * -
 * * * * * *
 * - * * * -
 * - - * - -
 * 
 */

public class Quest3 {

    public static void main(String[] args) {
        int n = leia("Digite a ordem da matriz (ímpar entre 1 e 15): ");

        char[][] matrix = generateMatrix(n);

        fillMiddleMatrix(matrix);

        printMatrix(matrix);
    }

    private static int leia(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        int n = scan.nextInt();
        if (n % 2 == 0 || n < 1 || n > 15) {
            System.out.println("Digite um numero valido!");
            return leia(message);
        }
        return n;
    }

    private static char[][] generateMatrix(int n) {
        char[][] matrix = new char[n][n];

        // preenche tudo com -
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '-';
            }
        }

        return matrix;
    }

    private static void fillMiddleMatrix(char[][] matrix) {
        int n = matrix.length;
        int mid = n / 2;

        // reescreve o conteudo com *, baseado no meio (mid)
        for (int i = 0; i <= mid; i++) {
            for (int j = mid - i; j <= mid + i; j++) {
                matrix[i][j] = '*';
                matrix[n - i - 1][j] = '*';
            }
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}
