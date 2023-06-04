package com.mycompany.app.Atv2;

/**
 * idade da pessoa; 
 * o identificador da pessoa; 
 * opinião em relação à peça(de 0 a 10).
 */
public class Answer {
  private int ID;
  public int getID() {
    return ID;
  }
  private int age;
  public int getAge() {
    return age;
  }
  private int hate;
  public int getHate() {
    return hate;
  }

  Answer(int id, int age, int hate){
    this.ID = id;
    this.age = age;
    this.hate = hate;
  }

  
}
