package com.mycompany.app.Atv2;

public class Produto {
  private int ID;
  public int getID() {
    return ID;
  }

  private double value;
  
  public double getValue() {
    return value;
  }

  public Produto(int iD, double value) {
    this.ID = iD;
    this.value = value;
  }

}
