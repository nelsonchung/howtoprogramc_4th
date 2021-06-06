// Fig. 24.20: AdditionApplet.java
// Adding two floating-point numbers
import java.awt.Graphics;   // import class Graphics
import javax.swing.*;       // import package javax.swing

public class AdditionApplet extends JApplet {
   double sum;  // sum of the values entered by the user

   public void init()
   {
      String firstNumber,   // first string entered by user
             secondNumber;  // second string entered by user
      double number1,       // first number to add
             number2;       // second number to add

      // read in first number from user
      firstNumber =
         JOptionPane.showInputDialog(
            "Enter first floating-point value" );

      // read in second number from user
      secondNumber =
         JOptionPane.showInputDialog(
            "Enter second floating-point value" );

      // convert numbers from type String to type double
      number1 = Double.parseDouble( firstNumber ); 
      number2 = Double.parseDouble( secondNumber );

      // add the numbers
      sum = number1 + number2;
   } // end method init

   public void paint( Graphics g )
   {
      // draw the results with g.drawString
      g.drawRect( 15, 10, 270, 20 );
      g.drawString( "The sum is " + sum, 25, 25 );
   } // end method paint
} // end class AdditionApplet


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
