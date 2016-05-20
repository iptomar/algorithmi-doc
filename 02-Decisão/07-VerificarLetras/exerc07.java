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
public class exerc07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu sexo \"M\" para masculino ou \"F\" para feminino ");
         String sexo = entrada.nextLine();
          if (sexo.trim().equals("M")){
             System.out.println("O seu sexo é Masculino"); 
             
         }else if(sexo.trim().equals("F")){
             System.out.println("O seu sexo é Feminino");
             
         }else{
             System.out.println("Letras Invalidas!...");
         }
             
         
    }
}
         