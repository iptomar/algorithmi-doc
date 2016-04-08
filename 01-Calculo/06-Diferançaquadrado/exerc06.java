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
public class exerc06 {
   public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
    double a;
    double b; 
    System.out.println("Introduza o valor de a :");
    a = ler.nextDouble();
     System.out.println("Introduza o valor de b:");
    b = ler.nextDouble();
    
    double res;
     res=(Math.pow(a,2)-Math.pow(b,2));
       System.out.println("A diferença do quadrado é:"+res);
    
}
}
