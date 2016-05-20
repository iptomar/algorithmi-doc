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
public class exerc08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Essas são as tuas Vogais: A, E, I, O, U");
        System.out.println("Consoantes: B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z");
        System.out.println("Digite uma letra ");
        String letra = ler.next();
        
        if(letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")){
            System.out.println(letra+" é uma Vogal ");
            
        }else{
            System.out.println(letra+" é uma Consoante");
            
        }
        
    
}
}
