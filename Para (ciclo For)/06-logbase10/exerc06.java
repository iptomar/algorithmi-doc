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
public class exerc06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num;
        for (int i = 1; i <=5; i++) {
            System.out.println("Digite o numero : ");  
            num=ler.nextDouble();
            if(num > 0){
                System.out.println("logaritmo :"+Math.log(num)/Math.log(10));
            }else{
                System.out.println("Não faço o logaritmo de valores negativos");
            }
        }
    }
}
