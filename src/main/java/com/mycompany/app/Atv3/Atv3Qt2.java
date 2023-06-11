package com.mycompany.app.Atv3;

import java.util.Scanner;

/**
 *  Faca um algoritmo q leia e armazene 5 valores inteiros em um vetor Vet1. 
 * Leia outros 5 valores inteiros e armazene num vetor Vet2. A partir destes valores lidos, mostre na tela:

 - a soma dos elementos de cada vetor, nas respectivas posições 

- a diferença dos elementos de cada vetor, nas respectivas posições 

- o produto dos elementos de cada vetor, nas respectivas posições 

- a divisão entre os elementos de cada vetor, nas respectivas posições 
 */
public class Atv3Qt2 {
  static Scanner scan = new Scanner(System.in);
  
  public static  int leia(String message) {
    System.out.println(message);
    return scan.nextInt();
  } 

  public static void main(String[] args) {

    int Vet1[] = new int[5];
    int Vet2[] = new int[5];

    for (int j = 0; j < Vet1.length; j++) {
      Vet1[j] = leia("Digite o " + j + " numero no Vet1: ");
    }

    for (int j = 0; j < Vet2.length; j++) {
      Vet2[j] = leia("Digite o " + j + " numero no Vet2: ");
    }

    System.out.println("Dado as informações de");
    System.out.print("Vet1: ");
    for (int j = 0; j < Vet1.length; j++) {
      System.out.print((Vet1[j]) + " ");
    }
    System.out.println();

    System.out.print("Vet2: ");
    for (int j = 0; j < Vet1.length; j++) {
      System.out.print((Vet1[j]) + " ");
    }
    System.out.println("\n\nTemos as seguintes informações: \n\n");

    //- a soma dos elementos de cada vetor, nas respectivas posições 
    System.out.println("Soma dos elementos de cada vetor: ");
    for (int j = 0; j < Vet1.length; j++) {
      System.out.print((Vet1[j] + Vet2[j]) + " ");
    }
    System.out.println();

    //- a diferença dos elementos de cada vetor, nas respectivas posições 
    System.out.println("Diferença dos elementos de cada vetor: ");
    for (int j = 0; j < Vet1.length; j++) {
      System.out.print(Math.abs(Vet1[j] - Vet2[j]) + " ");
    }
    System.out.println();
    
    //- o produto dos elementos de cada vetor, nas respectivas posições 
    System.out.println("Produto dos elementos de cada vetor: ");
    for (int j = 0; j < Vet1.length; j++) {
      System.out.print(Math.abs(Vet1[j] * Vet2[j]) + " ");
    }
    System.out.println();

    // - a divisão entre os elementos de cada vetor, nas respectivas posições 
    System.out.println("Divisão dos elementos de cada vetor: ");
    for (int j = 0; j < Vet1.length; j++) {
      System.out.print(Math.abs(Vet1[j] / Vet2[j]) + " ");
    }
    System.out.println();

  }
}
