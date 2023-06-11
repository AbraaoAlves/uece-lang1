package com.mycompany.app.Atv3;

public class Atv3Qt1 {
  
  public static void main(String[] args) {
    int matrix[][] = new int[][] {
      {1, 2, 3, 4},
      {1, 2, 3, 4},      
      {1, 2, 3, 4},
      {1, 2, 3, 4}
    };

    int transposta[][] = new int[matrix.length][matrix.length];

    for(var i = 0; i < matrix.length; i++){
      for(var j = 0; j < matrix[i].length; j++){
        transposta[j][i] = matrix[i][j];
      }
    };

    // print transposta
    for (int i = 0; i < transposta.length; i++) {
      for (int j = 0; j < transposta[i].length; j++) {
          System.out.print(transposta[i][j] + " ");
      }
      System.out.println();
    }
  }
}
