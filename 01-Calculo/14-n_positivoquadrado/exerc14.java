/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.calculo;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class excerc14 {
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     double  num,quadrado;
    System.out.println("Introduza um numero maior que zero:");
     num=ler.nextDouble();
     quadrado=Math.pow(num,2);
    double rquadrada=Math.sqrt(quadrado);
    System.out.println("o valor ao quadrado é"+quadrado);
    System.out.println("A raiz quadrado é"+rquadrada);   
     
    
}
}