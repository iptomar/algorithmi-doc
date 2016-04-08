/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.Scanner;




/**
 *
 * @author beto-
 */
public class Exercicio3 {
   public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza um número entre 1 e 10:");
        nota = teclado.nextInt();
        
        if(nota < 10){
               System.out.println("Reprovado");
 
            System.out.println("Aprovado");
        } 
    }
}
