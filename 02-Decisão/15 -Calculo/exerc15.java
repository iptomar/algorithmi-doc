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
public class exerc15 {

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        double operacao;
        System.out.println("Introduza o numero 1");
        double num1 = entradas.nextDouble();
        System.out.println("Introduza o numero 2");
        double num2 = entradas.nextDouble();
        System.out.println("Introduza o valor das Opções a calcular");
        double calcula = entradas.nextDouble();

        if (calcula == 1) {
            operacao = (num1 + num2);
            System.out.println(num1 + " + " + num2 + " = " + operacao);

        } else if (calcula == 2) {
            operacao = (num1 - num2);
            System.out.println(num1 + " - " + num2 + " = " + operacao);

        } else if (calcula == 3) {
            operacao = (num1 * num2);
            System.out.println(num1 + " * " + num2 + " = " + operacao);

        } else if (calcula == 4) {
            operacao = (num1 / num2);
            System.out.println(num1 + " / " + num2 + " = " + operacao);

        } else {
            System.out.println("Introduza o valor correcto");
        }

    }
}
