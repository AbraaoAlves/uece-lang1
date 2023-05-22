package com.mycompany.app;

import java.util.Scanner;

public class App1 {
  private static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("\n\nVamos descrever elementos de uma divisao!\n\n");
    
    int num1 = askNumber("Entre com primeiro numero:");
    int num2 = askNumber("Entre com segundo  numero:");

    System.out.println("Dividendo: " + num1);
    System.out.println("Divisor:   " + num2);
    System.out.println("Quociente: " + (num1 / num2));
    System.out.println("Resto:     " + num1 % num2);
  }

  public static int askNumber(String question) {
    System.out.println(question);
    return scan.nextInt();
  }
}
    