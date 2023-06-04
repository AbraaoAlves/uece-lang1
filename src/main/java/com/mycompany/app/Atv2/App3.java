package com.mycompany.app.Atv2;

import java.util.List;

/**
 * 
 * Uma empresa realizou uma pesquisa com os seus fornecedores, na qual foram coletados os seguintes dados referentes aos produtos fornecidos:
 * ID, Valor e Percentual de aumento 
 *
 * Obs. Se o produto não tiver sofrido alteração de preço, o percentual de aumento será igual a 0.
 *
 *  Faça um programa que determine e escreva: 
 * 
 *  1. O novo valor de cada um dos produtos. 
 *  2. A quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento superior a 5%. 
 *  3. A média de valor dos produtos que não sofreram aumento. 
 *  4. O valor do produto mais caro (após aumento).
 *
 *  Obs.: o programa solicita dados até que o ID digitado seja zero
 */
public class App3 {
  public static void main(String[] args){

      System.out.println("Programa de produtos! \n\n");
      // o programa solicita dados até que o ID digitado seja zero
      // ele deve devolver uma lista de entradas
      List<Entrada> entradas = InputProducts.getEntradas();
      System.out.println("Teste" + entradas.size());
//10
      //ProductsInfo info = new ProductsInfo(entradas);
//
      ////O novo valor de cada um dos produtos. 
      //List<Produto> produtos = info.getProdutos();
      //
      //System.out.println("| ID | Value |");
      //for (Produto produto : produtos) {
      //  System.out.printf("| %s | R$ %s |", produto.id, produto.value);
      //}
//
      //// A quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento superior a 5%.
      //int quantidade = info.expensiveProducts().size();
      //System.out.println("A quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento superior a 5%, foi: ");
      //System.out.printf("%s", quantidade);
//
      //// A média de valor dos produtos que não sofreram aumento.
      //double media = info.averageProductsWithoutRise();
      //System.out.println("A média de valor dos produtos que não sofreram aumento, foi: ");
      //System.out.printf("%s", media);
//
      ////O valor do produto mais caro (após aumento)
      //Produto produto = info.expensiveProduct();
      //System.out.println("O valor do produto mais caro (após aumento), foi: ");
      //System.out.printf("%s - R$ %s", produto.id, produto.value);
  }
}
