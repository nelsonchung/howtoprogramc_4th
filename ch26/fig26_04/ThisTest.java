// Fig. 26.4: ThisTest.java
// Using the this reference to refer to 
// instance variables and methods.
import javax.swing.*;
import java.text.DecimalFormat;

public class ThisTest {
   public static void main( String args[] )
   {
      SimpleTime t = new SimpleTime( 12, 30, 19 );

      JOptionPane.showMessageDialog( null, t.buildString(),
         "Demonstrating the \"this\" Reference",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end method main
} // end class ThisTest

class SimpleTime {
   private int hour, minute, second;   

   public SimpleTime( int hour, int minute, int second )
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   } // end SimpleTime constructor

   public String buildString()
   {
      return "this.toString(): " + this.toString() +
             "\ntoString(): " + toString() +
             "\nthis (with implicit toString() call): " +
             this;
   } // end method buildString

   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      
      return twoDigits.format( this.hour ) + ":" +
             twoDigits.format( this.minute ) + ":" +
             twoDigits.format( this.second );
   } // end method toString
} // end class SimpleTime


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
