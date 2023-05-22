package com.mycompany.app;

import java.util.Scanner;

public class App2 {
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("\n\nVamos descrever elementos de uma retangulo!\n\n");
    
    int base = ask("Qual comprimento da base do retangulo: ");
    int altura = ask("Qual a altura do retangulo: ");

    int perimetro = ((2*base) + (2*altura));
    int area = base * altura;

    System.out.println("Perimetro: " + perimetro);
    System.out.println("Area: " + area);
  }

  private static int ask(String question) {
    System.out.println(question);
    return scan.nextInt();
  }
}
