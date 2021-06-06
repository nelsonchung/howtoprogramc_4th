// Fig. 25.20: Histogram.java
// Histogram printing program
import javax.swing.*;

public class Histogram {
   public static void main( String args[] )
   {
      int n[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
      String output = "";   

      output += "Element\tValue\tHistogram";
   
      for ( int i = 0; i < n.length; i++ ) {
         output += "\n" + i + "\t" + n[ i ] + "\t";

         for ( int j = 1; j <= n[ i ]; j++ ) // print a bar
            output += "*";
      } // end for

      JTextArea outputArea = new JTextArea( 11, 30 );
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Histogram Printing Program",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class Histogram


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

