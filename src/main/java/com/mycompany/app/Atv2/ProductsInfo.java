package com.mycompany.app.Atv2;

import java.util.ArrayList;
import java.util.List;

public class ProductsInfo {
  List<Entrada> entradas;
  
  public ProductsInfo(List<Entrada> entradas) {
    this.entradas = entradas;
  }

  public List<Produto> getProdutos() {
    // transform entradas in produtos
    List<Produto> resultado = new ArrayList<Produto>();

    for (Entrada entrada : this.entradas) {
      int ID = entrada.getID();
      double value = entrada.getValue();
      double percent = entrada.getRisePercent();
      double aumento = value * (percent / 100);

      resultado.add(new Produto(ID, value + aumento));
    }

    return resultado;
  }
}
