/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza a sua nota:");
        nota = teclado.nextInt();
        
        if(nota >= 90 && nota <= 100){
               System.out.println("A");
        }else if(nota >= 60 && nota <= 89){
            System.err.println("B");
        }else if(nota >= 40 && nota <= 59){
            System.out.println("C");
        }else{
            System.out.println("F");
        } 
    }
}
    

