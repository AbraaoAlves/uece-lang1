package com.mycompany.app.PCC.atv1.quest4;

import java.io.*;

public class Disciplina implements Serializable{
  
  public Disciplina(){}
  public Disciplina(String nome, int creditos, int horas) {
    this.nome = nome;
    this.creditos = creditos;
    this.horas = horas;
  }

  private String nome;
  private int creditos;
  private int horas;

  public int getHoras() {
    return horas;
  }

  public int getCreditos() {
    return creditos;
  }

  public String getNome() {
    return nome;
  }
}
