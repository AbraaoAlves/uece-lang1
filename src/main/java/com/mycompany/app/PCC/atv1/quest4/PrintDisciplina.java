package com.mycompany.app.PCC.atv1.quest4;

public class PrintDisciplina {
  public static void print(Disciplina item) {
    System.out.println();
    System.out.println("Nome    : " + item.getNome());
    System.out.println("Creditos: " + item.getCreditos());
    System.out.println("Horas   : " + item.getHoras());

    System.out.println();

  }
}
