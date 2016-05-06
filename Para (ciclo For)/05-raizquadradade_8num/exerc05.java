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
public class exerc05 {
    
    public static void main(String[] args) {
        double numero;
        Scanner input = new Scanner(System.in);
        for (int a = 1; a <= 8; a++) {
            System.out.println("Digite o numero :");
            numero = input.nextDouble();
            if (numero >= 0) {
                System.out.println("Raíz:" + Math.sqrt(numero));
            } else {
                System.out.println("Não imprimo numero negativo");
            }
            
        }
    }
}
