package com.mycompany.app.Atv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputProducts {
  static Scanner scan = new Scanner(System.in);
  
  public static  double leia(String message) {
    System.out.println(message);
    return scan.nextDouble();
  } 

  public static List<Entrada> getEntradas() {
    
    List<Entrada> result = new ArrayList<Entrada>();

    while(true) {
      int ID = (int)leia("Digite o ID do produto: ");
      
      if (ID == 0) {
        break; //saiu do loop
      }
  
      double value = leia("Digite o Valor do produto: ");
      double percent = leia("Digite o Percentual de aumento do produto: ");
  
      Entrada entrada = new Entrada(ID, value, percent);
      
      result.add(entrada);
      System.out.println("Você pode finalizar a entrada de dados digitando 0(zero), ou: ");
    }
    
    return result;
  }

}
