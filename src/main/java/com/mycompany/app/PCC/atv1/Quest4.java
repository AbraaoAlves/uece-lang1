package com.mycompany.app.PCC.atv1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.PCC.atv1.quest4.CapturaDisciplina;
import com.mycompany.app.PCC.atv1.quest4.Disciplina;
import com.mycompany.app.PCC.atv1.quest4.DisciplinaIO;
import com.mycompany.app.PCC.atv1.quest4.PrintDisciplina;

/**
 * Faça um programa que armazene:
 * 
 * o nome (texto) da disciplina,
 * a quantidade de créditos (inteiro) e
 * a quantidade de horas (inteiro) de
 * 
 * 5 disciplinas e armazene-as em um arquivo binário.
 * 
 * Em seguida, apresente os dados de cada disciplina armazenados nesse arquivo.
 */
public class Quest4 {
  public static void main(String[] args) {

    List<Disciplina> list = CapturaDisciplina.captura();

    System.out.println("Disciplinas incluidas: ");
    PrintDisciplina.print(list);
    
    System.out.println();
    DisciplinaIO io = new DisciplinaIO("list.ser");

    try {
      io.appendWrite(list);
      List<Disciplina> newList = io.read();

      System.out.println("Todas as disciplinas registradas: ");

      PrintDisciplina.print(newList);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
