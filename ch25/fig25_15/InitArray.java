// Fig. 25.15: InitArray.java
// initializing an array
import javax.swing.*;

public class InitArray {
   public static void main( String args[] )
   {
      String output = "";
      int n[];            // declare reference to an array

      n = new int[ 10 ];  // dynamically allocate array

      output += "Subscript\tValue\n";
   
      for ( int i = 0; i < n.length; i++ ) 
         output += i + "\t" + n[ i ] + "\n";

      JTextArea outputArea = new JTextArea( 11, 10 );
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Initializing an Array of int Values",
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

