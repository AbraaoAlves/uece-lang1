package com.mycompany.app.Atv2;

public class Entrada {
  //  * ID, Valor e Percentual de aumento
  
  private int ID;
  public int getID() {
    return ID;
  }

  private double value;
  public double getValue() {
    return value;
  }

  private double risePercent;

  public double getRisePercent() {
    return risePercent;
  }

  public Entrada(int id, double value, double percent){
    this.ID = id;
    this.value = value;
    this.risePercent = percent;
  }

}
