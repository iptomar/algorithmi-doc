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
public class exerc18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero ");
        double numero = ler.nextDouble();

        if (numero > 0) {

            numero = Math.sqrt(numero);
            System.out.println("A raíz quadrada do numero é " + numero);

        } else {
            numero = Math.pow(numero, 2);
            System.out.println("O quadrado do numero é" + numero);
        }

    }
}
