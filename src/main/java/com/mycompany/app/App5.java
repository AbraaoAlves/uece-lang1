package com.mycompany.app;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que efetue a leitura de três valores 
 * para os lados de um triângulo, considerando lados como: A, B e C. 
 * 
 * O algoritmo deverá verificar se os lados fornecidos forma realmente um triângulo 
 * (cada lado é menor que a soma dos outros dois lados). 
 * 
 * Se for esta condição verdadeira, deverá ser indicado qual tipo de triângulo foi formado: 
 * 
 * isósceles (dois lados iguais e um diferente), 
 * escaleno (todos os lados diferentes) 
 * ou equilátero (todos os lados são iguais). 
 */
public class App5 {
  private static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {

    int a = ask("Qual o tamanho do lado A: ");
    int b = ask("Qual o tamanho do lado B: ");
    int c = ask("Qual o tamanho do lado C: ");
    
    // (cada lado deve ser menor que a soma dos outros dois lados) 
    boolean isTriangle = 
      a < b + c && 
      b < a + c && 
      c < b + a;

    if (isTriangle) {
      // responder que tipo de trianglo é
      
      if (a == b && b == c) {
        //* equilátero (todos os lados são iguais). 
        System.out.println("Equilatero");
      } else if (a != b && b != c && a != c) {
        //* escaleno (todos os lados diferentes) 
        System.out.println("Escaleno");
      } else {
        //* isósceles (dois lados iguais e um diferente), 
        System.out.println("Isóceles");
      }
    }
  }
  
  private static int ask(String question) {
    System.out.println(question);
    return +scan.nextInt();
  }
}
