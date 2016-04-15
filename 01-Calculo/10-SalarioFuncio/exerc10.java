/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.calculo;

import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class exerc10 {
      
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String nome;
            double salactual;
            System.out.println("Introduza o teu nome");
            nome=input.nextLine();
            System.out.println("Introduza o teu salario");
            salactual =input.nextDouble();
            double  novosalario= (salactual +(salactual*20/100));
            System.out.println("Sr(a)." +nome+ " recebrá o salario de €" +novosalario);
            
            
            
            
    
}
}
