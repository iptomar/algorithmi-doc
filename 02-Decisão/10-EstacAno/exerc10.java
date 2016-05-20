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
public class exerc10 {
    public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
        System.out.println(" Escolha a opcão do Menu referente ao período desejado :");
       
        System.out.println("1-Verão \n 2-Outono \n 3-Inverno \n 4-Primavera \n Outros \n");
         int opcao = dados.nextInt();
         
        if (opcao == 1) {
            System.out.println("Verão");

        } else if (opcao == 2) {
            System.out.println(" Outono");

        } else if (opcao == 3) {
            System.out.println("Inverno");

        } else if (opcao == 4) {
            System.out.println("Primavera");
        } else {
            System.out.println("Periodo Invalido");

        }

    }
}

