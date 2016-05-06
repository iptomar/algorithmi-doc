/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.Decisao;

import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class exerc13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rang;
        System.out.println("Introduza o simbolo da moeda");
       double ang = input.nextDouble();
       
        rang = ((ang * Math.PI )/180);
        
          if (((rang >Math.PI / 2 && rang <= Math.PI)||(rang > 3 * Math.PI/ 2 && rang <= 2 * Math.PI))) {
        
                System.out.println("O seno do ângulo pertence ao quadrante par :" +Math.sin(rang));
                
        
        }else {
             System.out.println("O cosseno do ângulo pertence ao quadrante impar :" +Math.sin(rang));  
            
        }

    }

}
