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
public class exerc02 {
     public static void main(String[] args){
         Scanner ler = new Scanner(System.in);
         System.out.println("Digite o seu nome ");
         String nome = ler.nextLine();
         System.out.println("Digite o primeira nota ");
         double nota1 = ler.nextDouble();
         System.out.println("Digite a segunda nota ");
         double  nota2 = ler.nextDouble();
         
         double media = ((nota1 + nota2)/2);
         System.out.println("A media final das duas nota é = "+media);
         if(media>=9.5){
             System.out.println("O aluno"+nome+"teve a média"+media+"e está aprovado \n");
             System.out.println("Muitos Parabens");
         } else
             System.out.println(" O aluno teve"+nome+"teve a média"+media+"e está reprovado");
     }
    
}
