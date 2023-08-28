package com.mycompany.app.PCC.atv1.operations;

public class Division extends Operation {
  public String getLabel(){
    return "Divisao";
  }
  public int calc(int a, int b) {
    return a/b;
  }
}
