package com.mycompany.app.npc;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Proponha um algoritmo que leia a ordem n (1 n 20) de uma matriz A de
 * elementos inteiros,
 * preencha-a com valores gerados aleatoriamente no intervalo de 1 a 10 e
 * apresente-a.
 * 
 * Em seguida, troque os elementos da diagonal principal com os da secundária,
 * 
 * em cada linha,e apresente novamente a matriz.
 */
public class App4 {
  public static void main(String[] args) {
    int n = 5; //ThreadLocalRandom.current().nextInt(1, 20);

    int matrix[][] = new int[n][n];
    System.out.println("Matrix Gerada:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 10);
      }
    }
    printMatrix(matrix);

    System.out.println("Matrix com diagnal trocada:");
    for (int i = 0; i < n; i++) {
      int temp = matrix[i][i];
      // index da Diagonal Secundaria
      int index = n - 1 - i; 
      matrix[i][i] = matrix[i][index];
      matrix[i][index] = temp;
    }
    printMatrix(matrix);
  }

  public static void printMatrix(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
