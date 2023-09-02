package com.mycompany.app.PCC.atv1.quest4;

import java.util.List;

public class PrintDisciplina {
  public static void print(Disciplina item) {
    System.out.println();
    System.out.println("Nome    : " + item.getNome());
    System.out.println("Creditos: " + item.getCreditos());
    System.out.println("Horas   : " + item.getHoras());

    System.out.println();

  }

  public static void print(List<Disciplina> list){
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");
    System.out.printf("%30s %5s %5s",  "NAME", "CREDITOS", "HORAS");
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");
    for(Disciplina item: list){
        System.out.format("%30s %5d %5s",
                item.getNome(), item.getCreditos(), item.getHoras());
        System.out.println();
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
  }
}
