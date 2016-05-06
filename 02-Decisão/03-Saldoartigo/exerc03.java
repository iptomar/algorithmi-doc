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
public class exerc03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo, custoartigo;
        System.out.println("Introduza o preço do produto ");
        int p = ler.nextInt();
        
        if (p > 1000)
        saldo = (p * 0.4);
        
        else if (p > 500) 
                    saldo = (p * 0.2);
                   
        else if (p > 250)
                                saldo = (p * 0.1);
                            
        else 
                                saldo = (p *0.05);
        
        custoartigo=(p - saldo);
            System.out.println("Terá um saldo de " + saldo + " euros \n");
            custoartigo=(p - saldo);
                System.out.println("O custo final do artigo é = "+custoartigo);
    }

}