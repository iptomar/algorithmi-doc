/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.Iteracao;

import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class exerc12 {
      public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int num;
          do {
              System.out.println("Digite um numero ou multiplo de 6 para acabar : "); 
              num = ler.nextInt();
              System.out.println("O quadrado do numero"+num+"="+Math.pow(num,2));
          }while(num % 6 !=0);
          
      
      }

}
