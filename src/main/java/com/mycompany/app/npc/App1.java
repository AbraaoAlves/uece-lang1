package com.mycompany.app.npc;

import java.util.Scanner;

/**
 * 
 *  Reescreva o algoritmo a seguir, que está em Portugol, utilizando a Linguagem Java.  
                                                                                                                                    (20 pontos) 
 
      Algoritmo "Questao1"  
      Var  
        a, b, i, n: inteiro  
      Inicio  
        escreva("Digite o valor de n: ")  
        leia(n)  
        a <- 1  
        b <- 1  
        para i de 3 ate n faca  
          b <- a + b  
          a <- b - a  
        fimpara  
        escreval("Resultado: ", b)  
      Fimalgoritmo

 */
public class App1 {
  
  public static void main(String[] args) {
    int a, b, i, n;
    System.out.println("Digite o valor de n:  ");
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    a = 1;
    b = 1;
    
    for (i = 3; i <= n; i++) {
      b = a+ b;
      a = b -a;
    }
    System.out.println("Resultado: " + b);
  }
}
