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
public class exerc11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um valor inteiro positivo para tabuada");
        int numero = 1;
            numero = ler.nextInt();
        
        if(numero < 10){
            System.out.println( numero+" * 1 = "+numero * 1);
            System.out.println( numero+" * 2 = "+numero * 2);
            System.out.println( numero+" * 3 = "+numero * 3);
            System.out.println( numero+" * 4 = "+numero * 4);
            System.out.println( numero+" * 5 = "+numero * 5);
            System.out.println( numero+" * 6 = "+numero * 6);
            System.out.println( numero+" * 7 = "+numero * 7);
            System.out.println( numero+" * 8 = "+numero * 8);
            System.out.println( numero+" * 9 = "+numero * 9);
            System.out.println( numero+" * 10 = "+numero * 10);
            
            
            
        }else{
            
            System.out.println("valores não definidos");  
            
        }
        
        
    }
    
}
