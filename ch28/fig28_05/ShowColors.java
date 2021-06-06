// Fig. 28.5: ShowColors.java
// Demonstrating Colors
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ShowColors extends JFrame {
   public ShowColors()
   {
      super( "Using colors" );

      setSize( 400, 130 );
      show();
   } // end ShowColors constructor

   public void paint( Graphics g )
   {
      // set new drawing color using integers
      g.setColor( new Color( 255, 0, 0 ) );
      g.fillRect( 25, 25, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 40 );

      // set new drawing color using floats
      g.setColor( new Color( 0.0f, 1.0f, 0.0f ) );
      g.fillRect( 25, 50, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 65 );

      // set new drawing color using static Color objects
      g.setColor( Color.blue );
      g.fillRect( 25, 75, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 90 );

      // display individual RGB values
      Color c = Color.magenta;
      g.setColor( c );
      g.fillRect( 25, 100, 100, 20 );
      g.drawString( "RGB values: " + c.getRed() + ", " +
         c.getGreen() + ", " + c.getBlue(), 130, 115 );
   } // end method paint

   public static void main( String args[] )
   {
      ShowColors app = new ShowColors();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous innerclass
      ); // end addWindowListener
   } // end method main
} // end class ShowColors


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
