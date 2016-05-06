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
public class exerc09 {
    
     public static void main(String[] args) {
         int impar = 0;
         Scanner ler = new Scanner(System.in);
         System.out.print("Digite um numero maior que zero :");
         int num =ler.nextInt();
         
         for (int i = 1; i <=num * 2; i+=2) {
             System.out.print("\n"+i);
             impar = impar + i;
         }
         System.out.println("\n A soma desses números é = "+impar);
     }
    
}
