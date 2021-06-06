// Fig. 27.3: InheritanceTest.java
// Demonstrating the "is a" relationship
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InheritanceTest {
   public static void main( String args[] )
   {
      Point pointRef, p; 
      Circle circleRef, c;
      String output;

      p = new Point( 30, 50 );
      c = new Circle( 2.7, 120, 89 );

      output = "Point p: " + p.toString() +
               "\nCircle c: " + c.toString();
   
      // use the "is a" relationship to refer to a Circle
      // with a Point reference
      pointRef = c;   // assign Circle to pointRef

      output += "\n\nCircle c (via pointRef): " +
                pointRef.toString();

      // Use downcasting (casting a superclass reference to a
      // subclass data type) to assign pointRef to circleRef
      circleRef = (Circle) pointRef;

      output += "\n\nCircle c (via circleRef): " +
                circleRef.toString();

      DecimalFormat precision2 = new DecimalFormat( "0.00" );
      output += "\nArea of c (via circleRef): " +
                precision2.format( circleRef.area() );

      // Attempt to refer to Point object
      // with Circle reference
      if ( p instanceof Circle ) {
         circleRef = (Circle) p;  // line 40 in Test.java
         output += "\n\ncast successful";
      }
      else
         output += "\n\np does not refer to a Circle";

      JOptionPane.showMessageDialog( null, output,
         "Demonstrating the \"is a\" relationship",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class InheritanceTest


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
