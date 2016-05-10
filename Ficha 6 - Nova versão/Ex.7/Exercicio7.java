/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio7 {
    
    public static void caixa(int larg, int alt,char c){
        for (int i = 0; i <= alt; i++) {
            for (int j = 0; j <=  larg; j++){
               if(j == 0 || j == larg){
                   System.out.print(c);
               }else if(i == 0 || i == alt){
                   System.out.print(c);
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
        char c;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza a altura:");
        alt = teclado.nextInt();
        System.out.println("Introduza a largura:");
        larg = teclado.nextInt();
        System.out.println("Introduza o caracter:");
        c = teclado.next().charAt(0);
        
        caixa(larg,alt,c);      
    }   
}
