package com.mycompany.app.Atv3;

import java.util.Scanner;

/**
 *  Escreva um programa que lê 2 matrizes 5 × 5, 
 *  mostre-as na tela e mostre a soma entre as duas matrizes em seguida. 
 * 
 */
public class Atv3Qt3 {
  static Scanner scan = new Scanner(System.in);

  public static  int leia(String message) {
    System.out.println(message);
    return scan.nextInt();
  } 

  public static int[][] leiaMatrix(String message) {
    int result[][] = new int[5][5];
    System.out.println(message);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        result[i][j] = leia("Digite o " + j + " numero da linha "+i+ " da matrix:");
      }
    }
    
    System.out.println();

    return result;
  }

  public static void printMatrix(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int matrix1[][] = leiaMatrix("Digite a matrix 1");
    int matrix2[][] = leiaMatrix("Digite a matrix 2");

    System.out.println("Matrix 1:");
    printMatrix(matrix1);

    System.out.println("Matrix 2:");
    printMatrix(matrix2);

    int soma[][] = new int[5][5];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        soma[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    System.out.println("A matrix soma: ");
    printMatrix(soma);
  }
}
