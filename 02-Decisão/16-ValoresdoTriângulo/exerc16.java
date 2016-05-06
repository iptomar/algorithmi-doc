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
public class exerc16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzir o valor 1");
        double lado1 = input.nextDouble();
        System.out.println("Introduzir o valor 2");
        double lado2 = input.nextDouble();
        System.out.println("Introduzir o valor 3");
        double lado3 = input.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Introduzir valor superior a zero");

        } else if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println("Não é triângulo");

        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triangulo Equilatero");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triangulo Isóceles");

        } else {
            System.out.println("Triângulo Escaleno");
        }

    }

}
