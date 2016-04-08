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
public class exerc09 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
            double sal,bonus,impost,desc,novosal;
            System.out.println("Introduza o seu salario base €");
            sal=ler.nextDouble();
            bonus=(sal*0.05);
            impost=(sal*0.07);
            desc=(sal-impost);
            novosal=(desc + bonus);
            System.out.println("O salario do funcionario a receber é de €"+novosal);
    
}
}