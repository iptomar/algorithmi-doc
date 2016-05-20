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
public class exerc04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
         System.out.println("Introduza a sua idade :");
        int idade = ler.nextInt();
        if (idade >= 18){
            System.out.println("Téns todo o dever de votar :");
        }else
            System.out.println("Não tém idade para votar");
       
        
        
    }
    
}
