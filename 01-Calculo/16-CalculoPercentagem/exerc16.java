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
public class exerc16 {
    
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
      double valor,percentagem,valor_final;
         System.out.println("Instroduza o valor do custo do produto €");
      valor = ler.nextDouble();
      percentagem =(15.0/100.0);
      valor_final=(valor  + (percentagem * valor));
         System.out.println(" O valor final do produto custa €" +valor_final);
    
     }   
}
