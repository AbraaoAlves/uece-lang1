package com.mycompany.app.PCC.atv1;

import java.util.Scanner;

import com.mycompany.app.PCC.atv1.operations.Operation;

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

    Operation operation = readOperation();
    String operationLabel = operation.getLabel();
    System.out.println("Operação escolhida: " + operation.getLabel());
    System.out.println();

    int[] numbers = getNumbers();
    int result = operation.calc(numbers[0], numbers[1]);
    System.out.println();
    System.out.println("O resultado  de sua '" + operationLabel + "' é " + result);
    System.out.println();
  }

  private static Operation readOperation() {
    System.out.println("Escolha uma operação valida para começar: ");
    System.out.println();
    System.out.println("(+) para soma");
    System.out.println("(-) para subtração");
    System.out.println("(*) para multiplicação");
    System.out.println("(/) para divisão");
    System.out.println();

    Operation result =  Operation.getOperation(scan.next().charAt(0));
    
    if (result == null){
      return readOperation();
    }else {
      return result;
    }
  }

  private static int[] getNumbers() {
    System.out.println("Digite dois os numeros que você quer calcular:");
    System.out.println();

    System.out.print("- A: ");
    int a = scan.nextInt();
    System.out.print("- B: ");
    int b = scan.nextInt();

    return new int[] { a, b };
  }
}