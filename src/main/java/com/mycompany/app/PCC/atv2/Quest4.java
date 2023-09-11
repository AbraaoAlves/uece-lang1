package com.mycompany.app.PCC.atv2;

import java.util.Scanner;

public class Quest4 {

  public static void main(String[] args) {
    int n = leia("Digite a ordem do quadrado magico (impar): ");
    
    int[][] quadrado = new int[n][n];

    int numero = 1;
    int linha = n / 2;
    int coluna = n - 1;
    
    quadrado[linha][coluna] = 1;

    while (numero < n * n) {
      numero++;

      int tLinha = linha;
      int tColuna = coluna;

      coluna = (coluna < n-1) ? coluna+1 : 0;
      linha  = (linha  < n-1) ? linha +1 : 0;
      
      if (quadrado[linha][coluna] != 0) {
        linha = tLinha;
        coluna= (tColuna>0)?  tColuna-1 : n-1;
      }

      quadrado[linha][coluna] = numero;
    }
    
    print(quadrado);
  }


  private static int leia(String message) {
    Scanner scan = new Scanner(System.in);
    System.out.print(message);
    int n = scan.nextInt();

    if (n % 2 == 0) {
      System.out.println("A ordem deve ser ímpar!");
      return leia(message);
    }

    return n;
  }

  private static void print(int[][] matrix){
     int n = matrix.length;
     for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int num = matrix[i][j];
        String numStr = (num < 10 ? "0" : "") + num;
        System.out.print(numStr + " ");
      }
      System.out.println();
    }
  }



}
