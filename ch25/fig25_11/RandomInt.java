// Fig. 25.11: RandomInt.java
// Shifted, scaled random integers
import javax.swing.JOptionPane;

public class RandomInt {
   public static void main( String args[] )
   {
      int value;
      String output = "";

      for ( int i = 1; i <= 20; i++ ) {
         value = 1 + (int) ( Math.random() * 6 );
         output += value + "  ";
         
         if ( i % 5 == 0 )
            output += "\n";
      }

      JOptionPane.showMessageDialog( null, output,
         "20 Random Numbers from 1 to 6",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class RandomInt


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
