package com.mycompany.app.PCC.atv1.quest4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapturaDisciplina {
  static Scanner scan = new Scanner(System.in);

  public static List<Disciplina> captura(int numeroCapturas) {
    List<Disciplina> list = new ArrayList<Disciplina>();

    for (int i = 0; i < numeroCapturas; i++) {
      Disciplina item = getDisciplina();
      list.add(item);
    }

    return list;
  }

  private static Disciplina getDisciplina() {

    scan.useDelimiter("\\n");

    System.out.println();
    System.out.println("Vamos cria uma nova disciplina!");

    System.out.print("Digite o nome da disciplina: ");
    String nome = scan.next();

    System.out.print("Digite o numero de creditos da Disciplina de '" + nome + "': ");
    int creditos = scan.nextInt();

    System.out.print("Digite o numero de horas da Disciplina de '" + nome + "': ");
    int horas = scan.nextInt();

    scan.reset();
    return new Disciplina(nome, creditos, horas);
  }
}
