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
public class exerc17 {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int soma;
        System.out.println("Leia o numero 1");
        int num1 = dados.nextInt();

        System.out.println("Leia o numero 2");
        int num2 = dados.nextInt();

        soma = num1 + num2;

        if(soma > 20){
            soma = soma + 8;
            System.out.println(num1+"+"+num2+" +8 = "+soma);
        }else{
              soma = soma - 5;
            
           System.out.println(num1+"+"+num2+" - 5 = "+soma);  
        }
        
    }
}
