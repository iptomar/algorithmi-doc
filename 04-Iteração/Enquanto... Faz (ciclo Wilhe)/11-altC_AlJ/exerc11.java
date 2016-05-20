/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.Iteracao;

/**
 *
 * @author Julay-PC
 */
public class exerc11 {
    
    
      public static void main(String[] args) {
          int anos=0;
          double AltC=1.5;
          double AltJ=1.1;
          
          while(AltJ <=AltC){
             AltC = AltC + 0.02;
             AltJ = AltJ + 0.03;
             anos +=1;
             
              
          }
          System.out.println("São necessarios "+anos+"anos");
      }

}
