/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.Decisao;

import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class exerc01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduza o numero 1:");
         int valor1 = entrada.nextInt();
        System.out.println("Introduza o numero 2:");
        int valor2 = entrada.nextInt();
        if (valor1 > valor2) {
            System.out.println(" O valor " +valor1+ " é maior que o valor " +valor2);
        } else {
            System.out.println(" Introduza o valor maior que o valor2 ");
        }

    }
}
