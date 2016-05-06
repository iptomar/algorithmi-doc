/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.calculo;

import java.util.Scanner;

/**
 *
 * @author JULAY
 */
public class exerc05 {
      public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double B;
            double m;
            double h;
            
            B=entrada.nextDouble();
            m=entrada.nextDouble();
            h=entrada.nextDouble();
            
            double A=((B+m)/2)*h;
            System.out.println(" A area do perimetro é:"+A);
    
}
}