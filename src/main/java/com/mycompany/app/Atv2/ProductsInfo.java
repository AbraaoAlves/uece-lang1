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
      double valor = entrada.newValue();

      resultado.add(new Produto(ID, valor));
    }

    return resultado;
  }
  
  /**
   * Produtos mais caros que R$ 100,00 (após aumento) e 
   * que tiveram aumento superior a 5%
   */
  public List<Produto> expensiveProducts() {
    List<Produto> resultado = new ArrayList<Produto>();
    List<Entrada> entradas = this.entradas;

    for (Entrada entrada : entradas) {
      double percent = entrada.getRisePercent();
      double valor = entrada.newValue();
      
      // apenas os acima de 100
      // e q tiveram aumento de +5%
      boolean isExpensive = valor > 100 && percent > 5;
      
      if(isExpensive) {
        resultado.add(new Produto(entrada.getID(), valor));
      }
    }

    return resultado;
  }

  /**
   * A média de valor dos produtos que não sofreram aumento.
   */
  public double averageProductsWithoutRise() {
    double somatorio = 0;
    int qtd = 0;
    
    for (Entrada entrada : this.entradas) {
      // apenas as entradas com percent 0
      if (entrada.getRisePercent() == 0) {
        qtd++;
        somatorio += entrada.getValue();
      }
    }
    
    double media = somatorio / qtd;

    return media;
  }
}
