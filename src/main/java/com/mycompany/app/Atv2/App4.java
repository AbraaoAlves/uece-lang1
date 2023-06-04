package com.mycompany.app.Atv2;

import java.util.List;

/**
 * 
 * Foi realizada uma pesquisa com 200 pessoas que assistiram uma peça de teatro, 
 * em relação a sua opinião sobre a mesma. 
 * 
 * Cada espectador respondeu a um questionário que solicitava os seguintes dados: 
 * 
 * idade da pessoa; 
 * o identificador da pessoa; 
 * opinião em relação à peça(de 0 a 10).
 * 
 * Faça um programa que, a partir destes dados, calcule e imprima:
 * a. A quantidade de respostas 10.
 * b. A média de idade das pessoas que responderam o questionário.
 * c. A percentagem de pessoas que responderam 5 ou menos para a opinião da peça.
 * d. O identificador da pessoa mais velha.
 * 
 * Considere que a maior idade não é repetida.
 */

public class App4 {
  public static void main(String[] args) {
    List<Answer> answers = InputQuestions.getAnswers();

    int qtdHighHate = 0;
    double sumAge = 0;
    double sumDislike = 0;
    Answer oldAnswer = answers.get(0);

    for (Answer answer : answers) {
      if (answer.getHate() == 10) {
        qtdHighHate++;
      } else if (answer.getHate() <= 5) {
        sumDislike++;
      }
      
      if (answer.getAge() > oldAnswer.getAge()) {
        oldAnswer = answer;
      }

      sumAge+=answer.getAge();
    }
    
    double averageAge = sumAge / answers.size();
    double percentDislike =  (100 * sumDislike) / answers.size();

    System.out.println("A quantidade de respostas 10. R = " + qtdHighHate);
    System.out.println("A média de idade das pessoas que responderam o questionário. R = " + averageAge);
    System.out.println("A percentagem de pessoas que responderam 5 ou menos para a opinião da peça. R = " + percentDislike);
    System.out.println("O identificador da pessoa mais velha. R = " + oldAnswer.getID()); 

  }  
}
