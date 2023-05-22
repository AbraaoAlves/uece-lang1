package com.mycompany.app;
import java.util.Scanner;

/**
 * Escrever um algoritmo para ler e imprimir três números. 
 * 
 * Se o primeiro for positivo, imprimir sua raiz quadrada, 
 * caso contrário, imprimir o seu quadrado; 
 * 
 * se o segundo número for maior que 10 e menor que 100, imprimir a mensagem: 
 *  “Número está entre 10 e 100 – intervalo permitido”; 
 * 
 * se o terceiro número for menor que o segundo, calcular e imprimir a diferença entre eles, 
 * 
 * caso contrário, imprimir o terceiro número adicionado de 1.
 */
public class App3 {
  private static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("\n\nVamos descrever a relação entre 3 numeros!\n\n");

    int num1 = ask("Digite o primeiro numero: ");
    int num2 = ask("Digite o segundo numero: ");
    int num3 = ask("Digite o terceiro numero: ");


    if (num1 > 0) {
      System.out.println((int)Math.sqrt(num1));
    } else {
      System.out.println((int)Math.pow(num1, 2));
    }
    
    if (num2> 10 && num2<100) {
      System.out.println("Número está entre 10 e 100 – intervalo permitido");
    } 
    
    if(num3<num2) {
      System.out.println((num2 - num3));
    } else {
      System.out.println(num3 + 1);
    }

  }

  private static int ask(String question) {
    System.out.println(question);
    return scan.nextInt();
  }
}
