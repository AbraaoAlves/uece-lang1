package com.mycompany.app.PCC.atv2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dois números são anagramas se eles possuem os mesmos dígitos. 
 * 
 * Proponha um algoritmo que leia um número inteiro e positivo n e, 
 * em seguida, apresente o menor (sem 0 à esquerda) e o maior números que são anagramas de n. 
 * 
 * Por exemplo, se n = 10302, o seu menor anagrama é 10023 e o seu maior anagrama é 32100
 */

public class Quest2 {
  private static int leia(String message){
    Scanner s = new Scanner(System.in);

    System.out.println(message);
    int result = s.nextInt();

    if (result < 0 || result != (int)result) {
      return leia(message);
    }

    return result;
  }

  public static void main(String[] args) {
    int n = leia("Digite um numero inteiro e positivo: ");

    String minAnagram = menorAnagrama(String.valueOf(n).toCharArray());
    String maxAnagram = new StringBuilder(minAnagram).reverse().toString();
    
    System.out.println("O maior anagrama de " + n + " é " + maxAnagram);
    System.out.println("O menor anagrama de " + n + " é " + minAnagram);
  }

  private static String menorAnagrama(char[] digits) {
    Arrays.sort(digits);
    String minAnagram = new String(digits);

    int firstNonZeroIndex = 0;
    while (minAnagram.charAt(firstNonZeroIndex) == '0') {
        firstNonZeroIndex++;
    }

    return minAnagram.substring(firstNonZeroIndex, firstNonZeroIndex + 1) + 
      minAnagram.substring(0, firstNonZeroIndex) + 
      minAnagram.substring(firstNonZeroIndex + 1);
  }
}
