/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio8 {
    
    public static double areaQuadrado(double lado){
        return lado*lado;
    }
    
    public static void main(String[] args) {
        double lado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o lado do quadrado:");
        lado = teclado.nextInt();
        
        System.out.println("Área: "+areaQuadrado(lado));      
    }   
}