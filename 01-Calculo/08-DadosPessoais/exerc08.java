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
public class exerc08 {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String nome;
            int idade;
            System.out.println("Ensira o seu nome :");
            nome=ler.nextLine();
            System.out.println("Quantos anos tens ?:");
            idade=ler.nextInt();
            System.out.println("Sr(a)" +nome+ " tém " +idade+ " anos de idade. ");
            
}
}