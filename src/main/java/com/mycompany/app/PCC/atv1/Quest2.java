package com.mycompany.app.PCC.atv1;

import java.util.Scanner;

/**
 * Faça um algoritmo que receba os seguintes dados de uma pessoa: 
 * nome (texto), cpf (texto), sexo (caractere) 
 * e o ano de nascimento (inteiro) e armazene-os em um registro. 
 * 
 * Em seguida,apresente o nome, o sexo e a idade dessa pessoa.
 * 
 */
public class Quest2 {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    String nome = inputString("Digite o nome da pessoa: ");
    String cpf = inputString("Digite o cpf da pessoa: ");
    char sexo = inputChar("Digite (M) para masculino e (F) para feminino: ");
    int anoNascimento = inputInt("Digite o ano de nascimento: ");

    printPessoa(nome, cpf, sexo, anoNascimento);
  }

  private static String inputString(String message) {
    System.out.println(message);
    return scan.nextLine();
  }

  private static int inputInt(String message) {
    System.out.println(message);
     return scan.nextInt();
  }

  private static char inputChar(String message) {
    System.out.println(message);
     return scan.next().charAt(0);
  }

  private static void printPessoa(String nome,String  cpf, char sexo ,int ano) {
    System.out.println();
    System.out.println("As informa\u00E7\u00F5es pessoais digitadas foram: ");
    System.out.println();
    System.out.println();

    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Feminino"));
    System.out.println("Ano: " + ano);
    System.out.println();    
  }
}
