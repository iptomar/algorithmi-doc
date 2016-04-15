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
public class exerc11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c, F;
        System.out.println("introduz o valor de c:");
        c = ler.nextInt();
        F = (((9 * c) + 160) / 5);
        System.out.println("A temperatura convertida para Fahrenheit é de" + F);

    }
}
