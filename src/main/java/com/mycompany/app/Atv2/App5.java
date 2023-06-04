package com.mycompany.app.Atv2;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia 10 salários. 
 * Depois de lidos e armazenados, mostre o maior valor. Utilize vetores
 */

public class App5 {
  static Scanner scan = new Scanner(System.in);
  public static  double leia(String message) {
    System.out.println(message);
    return scan.nextDouble();
  } 

  public static void main(String[] args){
    double salarios[] = new double[10];
    
    System.out.println("A seguir, digite 10 salarios: \n");

    for (int i = 0; i < 10; i++) {
      salarios[i] = leia("Digite o salario: ");  
    }

    double maiorSalario = 0;

    for (int i = 0; i < 10; i++) {
      if(salarios[i] > maiorSalario){
        maiorSalario = salarios[i];
      }
    }

    System.out.println("O maior salario é :" + maiorSalario);
  }
}
