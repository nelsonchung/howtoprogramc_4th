// Fig. 25.8: SquareInt.java
// A programmer-defined square method
import java.awt.Container;
import javax.swing.*;

public class SquareInt extends JApplet {
   public void init()
   {
      String output = "";

      JTextArea outputArea = new JTextArea( 10, 20 );

      // get the applet's GUI component display area
      Container c = getContentPane();

      // attach outputArea to Container c
      c.add( outputArea ); 

      int result;

      for ( int x = 1; x <= 10; x++ ) {
         result = square( x );
         output += "The square of " + x +
                   " is " + result + "\n";
      } // end for

      outputArea.setText( output );
   } // end method init
   
   // square method definition 
   public int square( int y )
   {
      return y * y;
   } // end method square
} // end class SquareInt


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
