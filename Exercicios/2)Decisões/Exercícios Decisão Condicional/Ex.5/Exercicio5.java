/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio5 {
   public static void main(String[] args) {
        int idade;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza a sua ideade");
        idade = teclado.nextInt();
        
        if(idade >= 18){
               System.out.println("Pode Conduzir");
 
            System.out.println("Não pode conduzir");
        } 
    }
}