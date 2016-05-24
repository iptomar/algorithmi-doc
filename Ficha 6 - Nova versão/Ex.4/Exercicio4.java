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
    
    public static void linha(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
               System.out.print("*");
            }
               System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o nº de linhas:");
        n = teclado.nextInt();
      
        linha(n);      
    }   
}