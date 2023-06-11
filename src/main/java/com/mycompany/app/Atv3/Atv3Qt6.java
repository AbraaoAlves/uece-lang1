package com.mycompany.app.Atv3;

import java.util.Scanner;

/**
 * Faça um programa que leia uma string digitada pelo usuário
 * (máximo 20 caracteres) e
 * 
 * imprima na tela o número de vogais existente nesta string
 */
public class Atv3Qt6 {
  static Scanner scan = new Scanner(System.in);

  public static String leia(String message) {

    System.out.println("(Com no maximo 20 caracteries)");
    System.out.println(message);

    String result = scan.nextLine();

    if (result.length()> 20) {
      return leia(message);
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println("Verificando o tamnho de uma string\n\n");

    String str = leia("Digite uma string: ");
    System.out.println("O numero de vogais na string (" + str +") é " + str.length());
  }
}
