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
public class exerc20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio,altura;
        System.out.println("Digite o valor do raio:");
        raio=ler.nextDouble();
        System.out.println("Digite o valor da altura:");
        altura=ler.nextDouble();
        
        double volume = ( 3.14 * Math.pow(raio, 2)*altura);
        System.out.println("O volume da lata do azeite" +volume);
    }

}
