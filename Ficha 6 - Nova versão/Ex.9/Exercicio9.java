/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio9;


import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio9 {
    
    public static double perimetroRetangulo(double alt, double comp){
        double perimetro;
        perimetro = 2*(alt)+2*(comp);
        return perimetro;
    }
    
    public static void main(String[] args) {
        double alt, comp;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza a altura:");
        alt = teclado.nextInt();
        System.out.println("Introduza o comprimento");
        comp = teclado.nextInt();
        
        System.out.println("Área: "+perimetroRetangulo(alt,comp));     
    }   
}
