package com.mycompany.app.PCC.atv1;

import java.util.HashMap;
import java.util.Map;
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
    Map<Character, String> operations = getOperations();
    System.out.println("System calc");
    System.out.println();
    
    char operation = readOperation(operations);
    System.out.println("Operação escolhida: " + operations.get(operation));
    System.out.println();
  }

  private static Map<Character, String> getOperations() {
    Map<Character, String> result = new HashMap<Character, String>();

    result.put('+', "Soma");
    result.put('-', "Subtração");
    result.put('*', "Multiplicação");
    result.put('/', "Divisão");

    return result; 
  }
  private static char readOperation(Map<Character, String> operations ){
    System.out.println("Escolha uma operação valida para começar: ");
    System.out.println();
    System.out.println("(+) para soma");
    System.out.println("(-) para subtração");
    System.out.println("(*) para multiplicação");
    System.out.println("(/) para divisão");
    System.out.println();

    char operation = scan.next().charAt(0);
    
    if (!operations.containsKey(operation)) {
      return readOperation(operations);  
    } else {
      return operation;
    }
  }

  private static void printOperation(char operation){

  }

}
