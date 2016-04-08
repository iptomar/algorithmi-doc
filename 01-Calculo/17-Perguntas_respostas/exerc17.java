/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.calculo;


/**
 *
 * @author Julay-PC
 */
public class exerc17 {
    
    
    public static void main(String args[]){ 
    double perguntas = 90.0;
    double acertadas = 72.0;
    
   
   double percentacerto = ((acertadas / perguntas) * 100);
      
   System.out.println("A percentagem de acerto é de:" + percentacerto + "%");
    
   double percenterros=(((perguntas - acertadas) / perguntas) * 100);

     System.out.println("A percentagem de erro é de:" + percenterros+ "%");

    System.exit(0);
  }
}


