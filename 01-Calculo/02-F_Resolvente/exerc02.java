/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.calculo;

import java.util.Scanner;

/**
 *
 * @author JULAY
 */
public class exerc02 {
    
     public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      double a;
      double b;
      double c;
      System.out.print("Insira um numero: ");
      a = ler.nextDouble();
      System.out.print("Insira um numero: ");
      b = ler.nextDouble();
      System.out.print("Insira um numero: ");
      c = ler.nextDouble();
      double x1;
      double x2;
      x1=(-b+Math.sqrt((b*b-4*a*c)))/(2*a);
      x2=(-b-Math.sqrt((b*b-4*a*c)))/(2*a);
        
         System.out.println("Os valores são :"+ x1 );
         System.out.println("Os valores são :"+ x2 );
         
     }

    
    }
