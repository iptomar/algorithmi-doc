/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio6 {
    
    public static void caixa(int larg, int alt){
        for (int i = 0; i <= alt; i++) {
            for (int j = 0; j <=  larg; j++){
               if(j == 0 || j == larg){
                   System.out.print("*");
               }else if(i == 0 || i == alt){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
               System.out.print(" ");
            }
               System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        int alt,larg;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza a altura:");
        alt = teclado.nextInt();
        System.out.println("Introduza a largura:");
        larg = teclado.nextInt();
        
        caixa(larg,alt);      
    }   
}
