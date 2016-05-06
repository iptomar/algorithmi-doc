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
public class exerc02 {

    public static void main(String[] args) {
        int i, prox;
        int ant = 0;
        int atual = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(atual);
            prox = ant + atual;
            ant = atual;
            atual = prox;

        }

    }

}
