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
public class exerc03 {
    
 public static void main(String[] args){
     int lado, area;
     Scanner ler = new Scanner(System.in);
     System.out.println("calcula area do quadrado:");
     lado= ler.nextInt();
     area = lado * lado ;
     System.out.println("A area do quadrado é"+ area);
 }
}

    
