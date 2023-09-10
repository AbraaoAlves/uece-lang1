package com.mycompany.app.PCC.atv2;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Proponha um algoritmo que leia um número inteiro n (1 n 100) 
 * e gere n valores inteiros de forma aleatória, no intervalo de 1 a 100, 
 * e insira um a um em um vetor V, de modo que, após a inserção de cada valor, 
 * o vetor fique sempre ordenado de forma crescente. 
 */
public class Quest1 {
  public static void main(String[] args) {
    int n = new SecureRandom().nextInt(1, 100);
    int[] vetor = new int[n];

    for (int i = 0; i < n; i++) {
      vetor[i] = new SecureRandom().nextInt(1, 100);
    }

    Arrays.sort(vetor);

    System.out.printf("Sorted vetor[] : %s", Arrays.toString(vetor));    
  }
}
