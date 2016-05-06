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
public class exerc20 {

    public static void main(String[] args) {
        double fx;
        Scanner ler = new Scanner(System.in);

        double x = ler.nextDouble();

        if (x > 4 || x < (-4)) {

            fx = ((5 * x + 3) / (Math.pow(x, 2) - 16));
            System.out.println("O valor de F(X) é = " + fx);
        } else {
            System.out.println("Não pode efectuar a operação");
        }

    }
}
