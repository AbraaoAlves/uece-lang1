package com.mycompany.app;

import java.time.temporal.ValueRange;
import java.util.Scanner;

/**
 * 
 * Elabore um algoritmo que, dada a idade de um nadador, 
 * 
 * classifique-o em uma das seguintes categorias:
 *
 * Infantil A: 5 a 7 anos;
 * Infantil B: 8 a 10 anos;
 * Juvenil A: 11 a 13 anos;
 * Juvenil B: 14 a 17 anos;
 * Sênior: maiores de 18 anos.
 */

public class App4 {
  private static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("\n\nCategoria de natação \n\n");

    int idade = ask("Qual a idade do nadador: ");
        
    if (ValueRange.of(0, 4).isValidIntValue(idade)){
      System.out.println("Pré-Infantil!");
    }

    if (ValueRange.of(5, 7).isValidIntValue(idade)){
      System.out.println("Infantil A");
    }

    if (ValueRange.of(8, 10).isValidIntValue(idade)){
      System.out.println("Infantil B");
    }

    if (ValueRange.of(11, 13).isValidIntValue(idade)){
      System.out.println("Juvenil A");
    }

    if (ValueRange.of(14, 17).isValidIntValue(idade)){
      System.out.println("Juvenil B");
    }

    if (idade >= 18){
      System.out.println("Senior");
    }   
  }

  private static int ask(String question) {
    System.out.println(question);
    return +scan.nextInt();
  }
}
