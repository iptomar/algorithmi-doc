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
public class exerc12 {
     public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
           int contador=1;
           double soma = 0;
           if(contador <=20){
               System.out.println("Informe o peso do atleta"+contador+ ":");
               double peso=dados.nextDouble();
               soma = soma + peso;
               contador = contador + 1;
               
               
           }else{
               
               
           }
           
       double media =(soma /20);
         System.out.println("O peso medio da equipa é = " +media);
}
}
