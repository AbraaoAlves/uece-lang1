package com.mycompany.app.PCC.atv1.operations;

public class Sum extends Operation {

  public String getLabel(){
    return "Soma";
  }
  public int calc(int a, int b) {
    return a+b;
  }
}
