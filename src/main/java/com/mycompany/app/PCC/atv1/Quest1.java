package com.mycompany.app.PCC.atv1;

import java.security.SecureRandom;

public class Quest1 {
  public static void main(String[] args) {
    int[][] numeros = new int[8][4];

    fillMatrix(numeros);
    printMatrix(numeros);
    printSumMatrix(numeros);
    printDiagonalSumMatrix(numeros);

  }
  
  private static void printDiagonalSumMatrix(int[][] matrix) {
    int result = 0;
    for(int i=0; i<matrix.length; i++){
      for(int c=0; c<matrix[i].length; c++){
        if (i == c) {
          result += matrix[i][c];
        }
      }
    }
    System.out.println("A Soma da diagonal é " + result);
  }

  private static void fillMatrix( int[][] matrix) {
    for(int i=0; i<matrix.length; i++){
      for(int c=0; c<matrix[i].length; c++){
        matrix[i][c] = new SecureRandom().nextInt(100);
      }
    }
  }
  private static void printMatrix(int[][] matrix) {
    for(int i=0; i<matrix.length; i++){
      for(int c=0; c<matrix[i].length; c++){
        int celula = matrix[i][c];
        System.out.print(celula + " ");
      }
      System.out.println();
    }
  }
  private static void printSumMatrix(int[][] matrix) {
    int result = 0;
    for(int i=0; i<matrix.length; i++){
      for(int c=0; c<matrix[i].length; c++){
        int celula = matrix[i][c];
        result += celula;
      }
    }
    System.out.println("Soma é " + result);
  }


  
}
