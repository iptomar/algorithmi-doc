/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.Iteracao;

import java.util.Scanner;

/**
 *
 * @author Julay-PC
 */
public class exerc08 {

    public static void main(String[] args) {
        int produto = 1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um numero");
        int num = ler.nextInt();
        for (int i = 1; i <= num; i++) {
            produto *= i;
            System.out.println(i);

        }
        System.out.println("O produto de 1 a " + num + " é : " + produto);
    }

}
