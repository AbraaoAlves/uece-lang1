package com.mycompany.app.Atv2;

import java.util.List;
import java.util.Scanner;

public class InputProducts {
  static Scanner scan = new Scanner(System.in);
  
  public static  double leia(String message) {
    System.out.println(message);
    return scan.nextDouble();
  } 

  public static List<Entrada> getEntradas() {
    
    int ID = (int)leia("Digite o ID do produto: ");
    double value = leia("Digite o Valor do produto: ");
    double percent = leia("Digite o Percentual de aumento do produto: ");

    Entrada entrada = new Entrada(ID, value, percent);


    return null;
  }

}
