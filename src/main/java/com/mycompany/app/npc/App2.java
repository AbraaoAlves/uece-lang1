package com.mycompany.app.npc;

import java.util.Scanner;

/**
 * Elabore um algoritmo que leia
 * 
 * 1. as duas notas obtidas por um aluno
 * (valores reais de 0 a 10) na disciplina de Linguagem de Programação I,
 * 
 * 2. o número total de aulas ministradas e
 * 
 * 3. o número de aulas que ele assistiu.
 * 
 * Calcule e apresente a média final e a sua frequência, ambas com duas casas
 * decimais.
 * 
 * Ao final, o seu algoritmo deve apresentar o resultado do aluno na disciplina.
 * Ele estará aprovado somente se obtiver frequência igual ou superior a 75% e
 * média final igual ou superior a 7:00.
 */
public class App2 {
  static Scanner scan = new Scanner(System.in);

  public static double leia(String mensagem) {
    System.out.println(mensagem);
    return scan.nextDouble();
  }

  public static void main(String[] args) {
    System.out.println("Algoritimo de aprovação");

    double nota1 = leia("Digite a 1º nota da Disciplina de Programação I: ");
    double nota2 = leia("Digite a 2º nota da Disciplina de Programação I: ");
    int aulas = (int) leia("Numero de aulas da diciplina: ");
    int presencas = (int) leia("Numer de aulas que o aluno assitiu: ");

    double media = (nota1 + nota2) / 2;
    double frequencia = (presencas * 100) / aulas;
    
    System.out.println(String.format("Sua nota final foi: %.2f", media));
    System.out.println(String.format("Seu percentual de frequencia foi: %.2f%%" , frequencia));
    System.out.println("\n");
    
    if (media >= 7.0 && frequencia >= 75) {
      System.out.println("Você foi APROVADO!");
    } else {
      System.out.println("Você foi REPROVADO!");
    }
  }
}
