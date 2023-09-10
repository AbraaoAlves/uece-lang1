package com.mycompany.app.PCC.atv2;

import java.util.Scanner;

public class Quest4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a ordem do quadrado mágico (ímpar): ");
    int n = scanner.nextInt();
    if (n % 2 == 0) {
      System.out.println("A ordem deve ser ímpar!");
      return;
    }

    int[][] quadrado = new int[n][n];

    int numero = 1;
    int linha = 0;
    int coluna = n / 2;
    
    while (numero <= n * n) {
      quadrado[linha][coluna] = numero;
      numero++;
      linha -= 1;
      coluna += 1;
      
      if (linha < 0) {
        linha = n - 1;
      }
      if (coluna == n) {
        coluna = 0;
      }

      if (linha == 0 && coluna == n-1) {
        coluna = n - 1;
        linha += 1;
      } else if (quadrado[linha][coluna] != 0) {
        linha += 1;
      }
      // if (quadrado[linha][coluna] != 0) {
      //   linha += 2;
      //   coluna--;
      //   if (linha == n) {
      //     linha = 0;
      //   }
      //   if (coluna < 0) {
      //     coluna = n - 1;
      //   }
      // }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int num = quadrado[i][j];
        String numStr = (num < 10 ? "0" : "") + num;
        System.out.print(numStr + " ");
      }
      System.out.println();
    }
  }
}
