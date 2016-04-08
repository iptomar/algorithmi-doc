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
public class exerc15 {
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
      double num1,num2,result;
         System.out.println(" Digite o primeiro numero maior que zero: ");
         num1=ler.nextDouble();
         System.out.println(" Digite o segundo numero maior que zero: ");
         num2=ler.nextDouble();
         
         result=Math.pow(num1, num2);
         System.out.println(" O numero " +num1+ " elavado á " +num2+ " é :" +result);
}
}