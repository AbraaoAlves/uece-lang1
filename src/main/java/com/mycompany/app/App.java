package com.mycompany.app;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class App {
  
  public static void main(String[] args) {
    int minutes = 0;
    int seconds = 0;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos segundos seu contador deve contar?");
    int duration = scan.nextInt(); // in seconds
    
    while (seconds < duration) {
      clearConsole();
      displayTimer(minutes, seconds);
      seconds++;
      if (seconds == 60) {
        minutes++;
        seconds = 0;
      }
      
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    scan.close();
    System.out.println("Timer finished!");
  }

  public static void displayTimer(int minutes, int seconds) {
    String minuteTens = numbersAsciiArt[minutes / 10];
    String minuteOnes = numbersAsciiArt[minutes % 10];
    String secondTens = numbersAsciiArt[seconds / 10];
    String secondOnes = numbersAsciiArt[seconds % 10];
    String separator = "    \n";

    String[] timerLines = new String[7];
    for (int i = 0; i < 7; i++) {
      timerLines[i] = minuteTens.split("\n")[i] + " " + minuteOnes.split("\n")[i] + separator
          + secondTens.split("\n")[i] + " " + secondOnes.split("\n")[i] + "\n";
    }

    for (String line : timerLines) {
      System.out.print(line);
    }
  }

  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static String[] numbersAsciiArt = {
    "  ***  \n" +
    " ** ** \n" +
    "**   **\n" +
    "**   **\n" +
    "**   **\n" +
    " ** ** \n" +
    "  ***  \n" ,
    
    "   *   \n" +
    " ***   \n" +
    "   *   \n" +
    "   *   \n" +
    "   *   \n" +
    "   *   \n" +
    " ***** \n" ,
    
    "  ***  \n" +
    " *  ** \n" +
    "     * \n" +
    "    ** \n" +
    "   **  \n" +
    "  **   \n" +
    " ******\n" ,
    
    "  ***  \n" +
    " *  ** \n" +
    "     * \n" +
    "  ***  \n" +
    "     * \n" +
    " *  ** \n" +
    "  ***  \n" ,
    
    "   **  \n" +
    "  ***  \n" +
    " * **  \n" +
    "*  **  \n" +
    "****** \n" +
    "   **  \n" +
    "   **  \n" ,
    
    " ***** \n" +
    " **    \n" +
    " ****  \n" +
    "     * \n" +
    "     * \n" +
    " *   * \n" +
    "  ***  \n" ,
    
    "  **** \n" +
    " **    \n" +
    " ***** \n" +
    " *   * \n" +
    " **  **\n" +
    " **  * \n" +
    "  **** \n" ,
    
    " ***** \n" +
    "    ** \n" +
    "    ** \n" +
    "   **  \n" +
    "   **  \n" +
    "  **   \n" +
    " **    \n" ,
    
    "  **** \n" +
    " **  **\n" +
    " **  **\n" +
    "  **** \n" +
    " **  **\n" +
    " **  **\n" +
    "  **** \n" ,
    
    "  ***  \n" +
    " ** ** \n" +
    "**   **\n" +
    " **  * \n" +
    "  **** \n" +
    "    ** \n" +
    " ****  \n"   
  };

}
