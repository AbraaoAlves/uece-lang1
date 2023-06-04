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
    int prev = -1;
    double resultS = 0; 
    for (int i = 1; i <= 4; i++) {
      prev += 2;
      resultS += prev/i;
      calc.add(String.format("%s/%s", prev, i));
    }   

    System.out.println("Calculo: S=" + String.join(" + ", calc));
    System.out.println("Resultado: S=" + resultS);
  }
}
