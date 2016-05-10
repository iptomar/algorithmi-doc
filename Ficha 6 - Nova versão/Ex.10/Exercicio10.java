/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;

import java.util.Scanner;

/**
 *
 * @author beto-
 */
public class Exercicio10 {
    
    public static boolean eTriangulo(double a, double b,double c){
        if(a+b>c){
            if(a+c>b){
                if(b+c>a){
                    return true;
                }
            }
        }
            return false;
    }
    
    public static void main(String[] args) {
        double a,b,c;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduza o 1º lado:");
        a = teclado.nextInt();
        System.out.println("Introduza o 2º lado:");
        b = teclado.nextInt();
        System.out.println("Introduza o 3ºlado:");
        c = teclado.nextInt();
        
        if(eTriangulo(a,b,c)==false){
            System.out.println("Não são lados de um triângulo");
        }else{
            System.out.println("São lados de um triângulo");
        }
    }   
}