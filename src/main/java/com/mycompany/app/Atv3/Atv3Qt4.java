package com.mycompany.app.Atv3;

/**
 *  Crie uma função que receba 3 números e retorne o menor valor,
 *  use a função da questão 5. 
 */
public class Atv3Qt4 {

  public static int menorValor(int a, int b, int c) {
    int list[] = new int[] {a, b, c};
    int result = a;
    for (int i : list) {
      if (i <= result) {
        result = i;
      }
    }
    return result;
  }
}
