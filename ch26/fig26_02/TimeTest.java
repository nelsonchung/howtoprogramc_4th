// Fig. 26.2: TimeTest.java
// Class TimeTest to use imported class Time1
import javax.swing.JOptionPane;
import com.deitel.chtp4.ch26.Time1;  // import Time1 class

public class TimeTest {
   public static void main( String args[] )
   {   
      Time1 t = new Time1();

      t.setTime( 13, 27, 06 );
      String output = 
         "Universal time is: " + t.toUniversalString() +
         "\nStandard time is: " + t.toString();

      JOptionPane.showMessageDialog( null, output,
         "Packaging Class Time1 for Reuse",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class TimeTest


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
