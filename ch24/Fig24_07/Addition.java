// Fig. 24.7: Addition.java
// An addition program 

import javax.swing.JOptionPane;  // import class JOptionPane

public class Addition {
   public static void main( String args[] )
   {
      String firstNumber,   // first string entered by user
             secondNumber;  // second string entered by user
      int number1,          // first number to add
          number2,          // second number to add
          sum;              // sum of number1 and number2

      // read in first number from user as a string
      firstNumber =
         JOptionPane.showInputDialog( "Enter first integer" );

      // read in second number from user as a string
      secondNumber =
         JOptionPane.showInputDialog( "Enter second integer" );

      // convert numbers from type String to type int
      number1 = Integer.parseInt( firstNumber ); 
      number2 = Integer.parseInt( secondNumber );

      // add the numbers
      sum = number1 + number2;

      // display the results
      JOptionPane.showMessageDialog(
         null, "The sum is " + sum, "Results",
         JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );   // terminate the program
   } // end main
} // end class Addition


/**************************************************************************
 * (C) Copyright 1992-2004 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

