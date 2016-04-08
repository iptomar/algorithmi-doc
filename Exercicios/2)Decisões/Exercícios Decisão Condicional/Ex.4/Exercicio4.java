/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio4 {
   public static void main(String[] args) {
        int num1,num2,num3;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o 1º número:");
        num1 = teclado.nextInt();
        System.out.println("Introduza o 2º número:");
        num2 = teclado.nextInt();
        System.out.println("Introduza o 3º número:");
        num3 = teclado.nextInt();
        
        if(num1 > num2){
            if(num1 > num3){
                if(num2 > num3){
                    System.out.println("Maior:"+num1+" Menor:"+num3);
                }else{
                    System.out.println("Maior:"+num1+" Menor:"+num2);
                }
            }else{
                System.out.println("Maior:"+num3+" Menor:"+num2);
            }
        }else if(num2 > num3){
            if(num1 > num3){
                System.out.println("Maior:"+num2+" Menor:"+num3);
            }else{
                System.out.println("Maior:"+num2+" Menor:"+num1);
            }
        }else{
            System.out.println("Maior:"+num3+" Menor:"+num1);
        }
    }
}
