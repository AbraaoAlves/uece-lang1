package com.mycompany.app.PCC.atv1.operations;

public class Subtraction extends Operation{
  public String getLabel(){
    return "Subtracao";
  }
  public int calc(int a, int b) {
    return a-b;
  }
}
