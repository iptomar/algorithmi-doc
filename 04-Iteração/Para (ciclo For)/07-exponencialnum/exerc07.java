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
public class exerc07 {

    public static void main(String[] args) {
       int potencia;
        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o valor da base da potência");
        int base = ler.nextInt();
        System.out.println("Introduza o valor do expoente da potência");
        int expoente = ler.nextInt();
        if(base >= 2 && expoente > 1){
             potencia = 1;
            for (int i = 1; i <=expoente; i++) {
                potencia = potencia * base;
            }
            System.out.println("Potência"+potencia);
        }else{
            System.out.println("Não satisfazem");
        }

    }
}
