package com.mycompany.app.Atv2;

import java.util.Scanner;

/**
 * 
 * 1. Um Banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. 
 * Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo.
 * 
 *  Mostre uma mensagem informando o saldo médio e o valor do crédito.
 * 
 *  saldo medio | Percentual
 * 
 * 0 a 200      | nenhum credito
 * 201 a 400    | 20% do valor do saldo medio
 * 401 a 600    | 30% do valor do saldo medio
 * acima de 600 | 40% do valor do saldo medio
 * 
 */

public class App1 {
  static Scanner scan  = new Scanner(System.in);
  
  public static  double leia(String message) {
    System.out.println(message);
    return scan.nextDouble();
  } 
  public static double porcentagem(int percent, double total) {
    // valor = (percent * total) / 100
    return (percent * total) / 100;
  } 
  
  public static void main(String[] args) {
    
    double valor = leia("Digite o saldo medio: ");
    double valorCredito = 0;

    if (valor < 200) {
      // calcular 0 % do valor
      valorCredito = porcentagem(0, valor);
    } 

    if (valor> 200 && valor<400) {
      // calcular 20 % do valor
      valorCredito = porcentagem(20, valor);
    }

    if (valor> 400 && valor<600) {
      // calcular 30 % do valor
      valorCredito = porcentagem(30, valor);
    }

    if (valor> 600 ) {
      // calcular 40 % do valor
      valorCredito = porcentagem(40, valor);
    }

    System.out.println("Saldo médio: " + valor);
    System.out.println("Valor do credito: " + valorCredito);
  }
}
