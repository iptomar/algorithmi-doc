/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio11 {
    
    public static double areaTriangulo(double a, double b,double c){
        double s, area;
        s = (a+b+c)/(2);
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
    public static void main(String[] args) {
        double a,b,c;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o lado a:");
        a = teclado.nextInt();
        System.out.println("Introduza o lado b:");
        b = teclado.nextInt();
        System.out.println("Introduza o lado c:");
        c = teclado.nextInt();
        
        System.out.println("Área: "+areaTriangulo(a,b,c));     
    }   
}
