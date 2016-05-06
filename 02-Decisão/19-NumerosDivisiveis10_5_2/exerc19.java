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
public class exerc19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um valor ");
        double valor = ler.nextDouble();

        if (valor % 10 == 0) {
            System.out.println("O numero é multiplo de 10");

        } else if (valor % 5 == 0) {
            System.out.println("O numero é multiplo de 5");

        } else if (valor % 2 == 0) {
            System.out.println("O numero é multiplo de 2");

        } else {
            System.out.println("Não é multiplo nem de 2 nem de 5 e nem de 10");
        }

    }
}
