/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class TesteFactorialRecursivo extends eecs.Gui
{
   public static void Factorial(?? n, /* i should not be an output */)
   {
      // declare variables
      ?? i = ??;
      
      if (n > 1)
      {
         Factorial(n - 1,i);
         i = n * i;
      }
      else
      {
         i = 1;
      }
      return i;
   } // close Factorial
 
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? i = ??;
      ?? n = ??;
      
      raptor_prompt_variable_zzyz = "Insira factorial a calcular";
      n = get???(raptor_prompt_variable_zzyz);
      Factorial(n,i);
      printLine(i);
   } // close main
} // close TesteFactorialRecursivo
