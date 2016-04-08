/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza um número entre 1 e 10:");
        num = teclado.nextInt();
        
        if(num < 1 && num > 10){
               System.out.println("O valor introduzido não é válido.");
        }else if(num < 5){
            System.out.println("O valor introduzido é menor que 5.");
        }else{
            System.out.println("O valor introduzido é maior que 5.");
        } 
    }
}
