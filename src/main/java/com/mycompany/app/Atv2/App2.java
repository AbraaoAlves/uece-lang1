package com.mycompany.app.Atv2;


import java.util.List;
import java.util.ArrayList;

/**
 * 
 * Faça um programa que calcule e escreva o valor de S:
 * 
 * S = 1/1 + 3/2 + 5/3 + 7/4 + 99/50
 */

public class App2 {
  public static void main(String[] args) {
    List<String> calc = new ArrayList<String>();
    double prev = -1.0;
    double resultS = 0; 

    for (double i = 1; i <= 50; i++) {
      prev += 2;
      resultS += prev/i;
      calc.add(String.format("%s/%s", (int)prev, (int)i));
    }   

    System.out.println("Calculo: S=" + String.join(" + ", calc));
    System.out.println("Resultado: S=" + resultS);
  }
}
