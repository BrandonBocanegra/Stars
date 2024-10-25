//*******************************************************
// StarsD_BB.java         Author: Brandon Bocanegra
// 
// 
// 
// Demonstarte the use of nested loops to create diamond
// pattern
//*******************************************************

public class StarsD_BB
{
      //-----------------------------------------------------------
      // Prints a Diamond shape using asterik (star) characters
      //-----------------------------------------------------------
      public static void main(String[]args)
      {
   
         // The amount of rows at the top and bottom of diamond
         final int MAX_ROWS = 5;
         
         for (int row = 1; row <= MAX_ROWS; row++)
         {      
            // Inputs spaces
            for (int space = 1; space <= MAX_ROWS - row; space++)
               System.out.print(" ");
            // Inputs stars
            for (int star = 1; star <= 2 * row - 1; star++)
               System.out.print("*");
          
             System.out.println();
         }   
         
           for (int row = 1; row <= 10; row++)

          {
             // Inputs spaces
             for (int space = 4; space > MAX_ROWS - row; space--)
             System.out.print(" ");
             // Inputs stars
             for (int star = 10; star > 2 * row - 1; star--)
             System.out.print("*");
          
             System.out.println();
                                  
         }
      }
 }
            
