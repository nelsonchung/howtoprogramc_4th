// Fig. 25.17: InitArray.java
// initialize array n to the even integers from 2 to 20
import javax.swing.*;

public class InitArray {
   public static void main( String args[] )
   {
      final int ARRAY_SIZE = 10;
      int n[];                    // reference to int array
      String output = "";

      n = new int[ ARRAY_SIZE ];  // allocate array

      // Set the values in the array
      for ( int i = 0; i < n.length; i++ ) 
         n[ i ] = 2 + 2 * i;

      output += "Subscript\tValue\n";
   
      for ( int i = 0; i < n.length; i++ ) 
         output += i + "\t" + n[ i ] + "\n";

      JTextArea outputArea = new JTextArea( 11, 10 );
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Initializing to Even Numbers from 2 to 20",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class InitArray


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

