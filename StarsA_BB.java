//*******************************************************
// StarsA_BB.java         Author: Brandon Bocanegra
// 
// Stars Triangle Program
// Due Date: January 21st, 2024
// Demonstarte the use of nested loops to create triangle
// pattern
//*******************************************************

public class StarsA_BB
{
      //-----------------------------------------------------------
      // Prints a triangle shape using asterik (star) characters
      //-----------------------------------------------------------
      public static void main(String[]args)
      { 
         final int MAX_ROWS = 10;
         
         for (int row = 0; row <= MAX_ROWS; row++)
         
         {
            for (int  star = 10; star > row; star--)
                System.out.print("*");
                
            System.out.println();
         }
      }
}
       