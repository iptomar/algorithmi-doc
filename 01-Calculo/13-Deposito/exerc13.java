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
public class exerc13 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     double deposito,taxa_juros,rendimento,total;
        System.out.println("Quanto quer depositar ?");
        deposito=ler.nextDouble();
        System.out.println("A taxa de juro associado é:");
        taxa_juros=ler.nextDouble();
        rendimento=(deposito*(taxa_juros/100));
        total=(deposito + rendimento);
        System.out.println("O valor do rendimento é:"+rendimento);
        System.out.println("O valor total após o rendimento é:"+total);
        
}
}