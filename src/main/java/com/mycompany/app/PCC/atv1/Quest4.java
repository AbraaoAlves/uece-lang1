package com.mycompany.app.PCC.atv1;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.PCC.atv1.quest4.CapturaDisciplina;
import com.mycompany.app.PCC.atv1.quest4.Disciplina;
import com.mycompany.app.PCC.atv1.quest4.PrintDisciplina;

/**
 * Faça um programa que armazene:
 *  
 * o nome (texto) da disciplina, 
 * a quantidade de créditos (inteiro) e 
 * a quantidade de horas (inteiro) de 
 * 
 * 5 disciplinas e  armazene-as em um arquivo binário. 
 * 
 * Em seguida, apresente os dados de cada disciplina armazenados nesse arquivo.
 */
public class Quest4 {
  public static void main(String[] args) {
    System.out.println("Hello wolrd");

    List<Disciplina> list = new ArrayList<Disciplina>();
    
    for (int i = 0; i < 5; i++) {
      Disciplina item = CapturaDisciplina.captura();
      PrintDisciplina.print(item);

      list.add(item);
    }






  }
}
