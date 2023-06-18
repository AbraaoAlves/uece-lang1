package com.mycompany.app.npc;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Proponha um algoritmo que preencha um vetor de 10 elementos inteiros, 
 * com valores gerados aleatoriamente no intervalo de 1 a 100, 
 * 
 * 1. apresente-o e, 
 * 
 * 2. em seguida, ordene-o em ordem crescente do valor dos elementos 
 * 
 * 3. e apresente-o novamente.
 */

public class App3 {
  public static void showVetor(int vetor[]) {
    System.out.println("{");
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("'" + i + "': " + vetor[i] + ", ");
    }
    System.out.println("}");
  }

  public static void main(String[] args) {
    int vetor[] = new int[10];
    
    System.out.println("Vetor gerado: ");
    for (int i = 0; i < 10; i++) {
      vetor[i] = ThreadLocalRandom.current().nextInt(1, 100);
    } 
    showVetor(vetor);

    System.out.println("Vetor ordenado: ");
    int ordenado[] = Arrays.copyOf(vetor, vetor.length);
    Arrays.sort(ordenado);

    showVetor(ordenado);
  }
}
