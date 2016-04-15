/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.calculo;

import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class exerc19 {
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
      String nome;
      int ano,idade,meses,dias,semana;
         
     System.out.println( "Como te chamas ? ");
     nome=ler.nextLine();
     System.out.println(" Qual é o ano do teu nascimento ? ");
     ano=ler.nextInt();
     idade=(2016 - ano);
     meses = (idade * 12);
     dias = (idade * 365);
     semana = (idade * 52);
     System.out.println(" O(a)" + nome + " tém " + idade + " anos ");
     System.out.println("Podemos concluir que ele(a) tém " + meses + " meses ");
     System.out.println(" Logo terá " + dias + "dias na vida ");
      System.out.println(" Possuindo portanto " + semana + "semanas ");
     
}
}