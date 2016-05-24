/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio13;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio13 {
    
    public static double areaElipse(double raio1,double raio2){
        double area;
        area = Math.PI * raio1 * raio2;
        return area;
    }
    
    public static void main(String[] args) {
        double raio1, raio2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o 1º raio:");
        raio1 = teclado.nextInt();
        System.out.println("Introduza o 2º raio:");
        raio2 = teclado.nextInt();
        
        System.out.println("Área: "+areaElipse(raio1,raio2));     
    }   
}
