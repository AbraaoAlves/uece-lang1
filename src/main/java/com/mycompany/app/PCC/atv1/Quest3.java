package com.mycompany.app.PCC.atv1;

import java.util.Scanner;

/**
 * 
 * Faça um algoritmo chamado calculadora, que exiba as opções de operações 
 * (soma, subtração, multiplicação e divisão). 
 * 
 * O usuário deve escolher a operação e fornecer dois números. 
 * Cada operação deverá ser criada em um procedimento (sub-rotina).
 */
public class Quest3 {
   
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("System calc");
    System.out.println();

    char operation = readOperation();
    System.out.println("Operação escolhida: " + operation);
  }

  private static char readOperation(){
    System.out.println("Escolha uma operação valida para começar: ");
    System.out.println();
    System.out.println("(+) para soma");
    System.out.println("(-) para subtração");
    System.out.println("(*) para multiplicação");
    System.out.println("(/) para divisão");
    System.out.println();

    char operation = scan.next().charAt(0);
    String operations = "+-*/";
    
    if (!operations.contains(operations)) {
      return readOperation();  
    } else {
      return operation;
    }
  }

}
