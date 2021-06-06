// Fig. 25.18: SumArray.java
// Compute the sum of the elements of the array
import javax.swing.*;

public class SumArray {
   public static void main( String args[] )
   {
      int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int total = 0;

      for ( int i = 0; i < a.length; i++ ) 
         total += a[ i ];

      JOptionPane.showMessageDialog( null, 
         "Total of array elements: " + total,
         "Sum the Elements of an Array",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class SumArray


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
