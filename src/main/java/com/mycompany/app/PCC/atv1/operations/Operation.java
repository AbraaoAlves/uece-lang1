package com.mycompany.app.PCC.atv1.operations;

import java.util.HashMap;
import java.util.Map;


public abstract class Operation {
  protected String label;
  
  static Map<Character, Operation> mapper = operations();

  private static Map<Character, Operation> operations() {
    Map<Character, Operation> mapper = new HashMap<Character, Operation>();
    mapper.put('+', new Sum());
    mapper.put('-', new Subtraction());
    mapper.put('*', new Multiplication());
    mapper.put('/', new Division());
    return mapper;
  }
  
  public static Operation getOperation(char operation){
    return mapper.get(operation);
  }

  public abstract int calc(int a, int b);
  public abstract String getLabel();
}
