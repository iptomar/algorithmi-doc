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
public class exerc09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("produto 1");
        double produto1 = ler.nextDouble();
        System.out.println("produto 2");
        double produto2 = ler.nextDouble();
        System.out.println("Produto 3");
        double produto3 = ler.nextDouble();
        if(produto1 < produto2 && produto1 <produto3){
            System.out.println("Compra o produto 1 á " + produto1 + "€ é o menor preço");
        }else if (produto2 < produto1 && produto2 <produto3){
            System.out.println("Compra o produto 2 á " + produto2 + "€ é o menor preço"); 
            
        }else if ((produto3 < produto1 && produto3 <produto2)){
            System.out.println("Compra o produto 3 á " + produto3 + "€ é o menor preço");
            
        }else{
            
        }
    }
}
