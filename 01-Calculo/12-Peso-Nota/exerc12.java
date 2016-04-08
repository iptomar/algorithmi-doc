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
public class exerc12 {
     public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            double n1,n2,n3,p1,p2,p3;
            System.out.println("introduza a valor da nota1 e o seu peso");
            n1=ler.nextDouble();
            p1=ler.nextDouble();
           System.out.println("introduza a valor da nota2 e o seu peso");
            n2=ler.nextDouble();
            p2=ler.nextDouble();
           System.out.println("introduza a valor da nota3 e o seu peso");
            n3=ler.nextDouble();
            p3=ler.nextDouble();
            double mediaPonderada=((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
           System.out.println("A media ponderada das três notas é:"+mediaPonderada); 
            
    
}
}