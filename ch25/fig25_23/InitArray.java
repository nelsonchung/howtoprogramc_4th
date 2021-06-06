// Fig. 25.23: InitArray.java
// Initializing multidimensional arrays
import java.awt.Container;
import javax.swing.*;

public class InitArray extends JApplet {
   JTextArea outputArea;

   // initialize the applet
   public void init()
   {
      outputArea = new JTextArea();
      Container c = getContentPane();
      c.add( outputArea );

      int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };        
      int array2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } }; 

      outputArea.setText( "Values in array1 by row are\n" );
      buildOutput( array1 );
   
      outputArea.append( "\nValues in array2 by row are\n" );
      buildOutput( array2 );
   } // end method init

   public void buildOutput( int a[][] )
   {
      for ( int i = 0; i < a.length; i++ ) {

         for ( int j = 0; j < a[ i ].length; j++ )  
            outputArea.append( a[ i ][ j ] + "  " );

         outputArea.append( "\n" );
      } // end for
   } // end method buildOutput
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

