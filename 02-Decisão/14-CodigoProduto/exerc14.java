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
public class exerc14 {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println(" 1-PIZZA \n 2-Refrigerante \n 3-Café \n Outros \n");
        System.out.println(" Introduza o Código do produto");
        int codigo = dados.nextInt();

        System.out.println("Introduza quantidade do produto que desejas ");
        int quant = dados.nextInt();
        
        System.out.println("Introduza o preço do produto");
        double preco = dados.nextDouble();
        

        if (codigo == 1) {
            System.out.println("Pizza ");
            System.out.println("Total a pagar é €" + (preco * quant));

        } else if (codigo == 2) {
            System.out.println("Refrigerante ");
            System.out.println("Total a pagar é €" + (preco* quant));
        } else if (codigo == 3) {
            System.out.println("Café");
            System.out.println("Total a pagar é €" + (preco * quant));

        } else {
            System.out.println("Produto Inexistente");

        }

    }
}
