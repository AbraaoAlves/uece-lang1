package com.mycompany.app.Atv3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Leia e armazene num vetor de 10 posições o nome dos alunos 
 * aprovados no vestibular para Ciência da Computação em 2007/1. 
 * 
 * A seguir, leia um nome de entrada e verifique se este aluno 
 * consta na listagem dos aprovados e mostre sua classificação 
 * (ordem de aprovação, representada pelo índice do vetor +1). 
 * 
 * Caso o nome informado não exista na lista dos aprovados, 
 * mostre uma mensagem ‘Nome informado não consta na lista dos aprovados’. 
 * 
 *  Ex: Vetor de Aprovados
 * 
 *  Ana Santos, Joao Sousa, Maria Silveira, ...
 * 
 * // out O aluno João Sousa foi aprovado em 2º lugar 
 *
 */
public class Atv3Qt5 {
  static Scanner scan = new Scanner(System.in);

  public static String leia(String message) {
    System.out.println(message);
    return scan.nextLine();
  } 

  public static String[] leiaVetor(String message) {
    String result[] = new String[10];
    System.out.println(message);

    for (int i = 0; i < 5; i++) {
      result[i] = leia("Digite o " + i + " nome da lista:");
    }
    
    System.out.println();

    return result;
  }

  public static void main(String[] args) {
        String alunos[] = leiaVetor("Digite o nome dos alunos aprovados: ");
        String aluno = leia("Digite o nome do aluno que você quer buscar: ");
        int lugar = -1;

        for (int i = 0; i < alunos.length; i++) {
          String item = alunos[i].toLowerCase();

          if (item.contains(aluno.toLowerCase())) {
            lugar = i;
          }
        }
        if (lugar == -1) {
          System.out.println("Nome informado não consta na lista dos aprovados");
        } else {
          System.out.printf("O aluno %s foi aprovado em %sº lugar ", aluno, lugar+1);
        }
  }  
}
