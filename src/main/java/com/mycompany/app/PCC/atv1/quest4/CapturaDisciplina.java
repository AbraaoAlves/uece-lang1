package com.mycompany.app.PCC.atv1.quest4;

import java.util.Scanner;

public class CapturaDisciplina {
  static Scanner scan = new Scanner(System.in);

  public static Disciplina captura(){
    System.out.println("Vamos cria uma nova disciplina!");
    System.out.println();

    System.out.println("Digite o nome da disciplina: ");
    String nome = scan.nextLine();

    System.out.println("Digite o numero de creditos da Disciplina de '" + nome + "': ");
    int creditos = scan.nextInt();
    
    System.out.println("Digite o numero de horas da Disciplina de '" + nome + "'");
    int horas = scan.nextInt();

    return new Disciplina(nome, creditos, horas);
  }
}
