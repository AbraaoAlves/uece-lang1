package com.mycompany.app.PCC.atv1.operations;

public class Multiplication extends Operation {
  public String getLabel(){
    return "Multiplicacao";
  }
  public int calc(int a, int b) {
    return a*b;
  }
}
