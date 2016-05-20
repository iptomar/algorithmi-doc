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
public class exerc05 {
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double multa=0;
        double excesso=0;
        System.out.println("Introduza o quilo do peixe capturado");
       double peso = ler.nextInt();
       if(peso > 50){
           excesso = peso - 50;
           multa = excesso * 5;
            System.out.println(" Atenção que excedeu o peso, tem multa a pagar de"+multa);        
           
       }else 
            System.out.println("Upss livras-te da multa...."+multa);       
        
    }
}
