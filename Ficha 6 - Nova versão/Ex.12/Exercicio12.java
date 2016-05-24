/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio12;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio12 {
    
    public static double areaCirculo(double raio){
        double area;
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }
    
    public static void main(String[] args) {
        double raio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o raio:");
        raio = teclado.nextInt();
        
        System.out.println("Área: "+areaCirculo(raio));     
    }   
}
