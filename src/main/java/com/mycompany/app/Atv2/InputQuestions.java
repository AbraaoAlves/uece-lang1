package com.mycompany.app.Atv2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class InputQuestions {

  public static List<Answer> getAnswers() {
    List<Answer> result = new ArrayList<Answer>();
    
    for (int i = 0; i < 200; i++) {
      
      int age = ThreadLocalRandom.current().nextInt(7, 91);; // 8 ate 90
      int hate = ThreadLocalRandom.current().nextInt(0, 11);; // 1 ate 10

      result.add(new Answer(i, age, hate));   
    }

    return result;
  }

}
