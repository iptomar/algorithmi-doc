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
public class exerc06 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println(" digite o seu nome : \n");
         String nome =dados.next();
         
         
        System.out.println("1-solteiro(a) \n 2-casado(a)\n 3-divorsiado(a)\n 4-viuvo(a)\n  Outros \n");
        
         Scanner civil = new Scanner(System.in);
         System.out.println(" digite o numero do seu estado civil:");
         int estadocivil=civil.nextInt();
         
       
         
         if(estadocivil == 1){
             System.out.println(nome+"é solteiro");
             
         }else if(estadocivil == 2){
             System.out.println(nome+"é Casado");
             
         }else if(estadocivil == 3){
             System.out.println(nome+"é Divorciado");
             
             }else if(estadocivil == 4){
             System.out.println(nome+"é Viúvo");
         }else{
                 System.out.println("Dados Incorrectos");
             
         }
             
                  
}
    }
