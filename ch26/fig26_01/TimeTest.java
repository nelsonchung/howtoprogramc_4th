// Fig. 26.1: TimeTest.java
// Class TimeTest to exercise class Time1
import javax.swing.JOptionPane;

public class TimeTest {
   public static void main( String args[] )
   {
      Time1 t = new Time1();  // calls Time1 constructor
      String output;

      output = "The initial universal time is: " +
               t.toUniversalString() +
               "\nThe initial standard time is: " +
               t.toString() +
               "\nImplicit toString() call: " + t;

      t.setTime( 13, 27, 6 ); 
      output += "\n\nUniversal time after setTime is: " + 
                t.toUniversalString() +
                "\nStandard time after setTime is: " +
                t.toString();

      t.setTime( 99, 99, 99 );  // all invalid values
      output += "\n\nAfter attempting invalid settings: " + 
                "\nUniversal time: " + t.toUniversalString() +
                "\nStandard time: " + t.toString();

      JOptionPane.showMessageDialog( null, output,
         "Testing Class Time1",
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
