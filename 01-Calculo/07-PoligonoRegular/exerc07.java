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
public class exerc07 {
     public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   int n,ai;
         System.out.println("Introduza o numero de lados:");
   n=ler.nextInt();
   ai=(((n-2)*180)/n);
         System.out.println("O Angulo interno é:"+ai);
    
    
}
}
