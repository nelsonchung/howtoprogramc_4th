// Fig. 29.21: SelfContainedPanel.java
// A self-contained JPanel class that
// handles its own mouse events.
package com.deitel.chtp4.ch29;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelfContainedPanel extends JPanel {
   private int x1, y1, x2, y2;

   public SelfContainedPanel()
   {
      addMouseListener(
         new MouseAdapter() {
            public void mousePressed( MouseEvent e )
            {
               x1 = e.getX();
               y1 = e.getY();
            } // end method mousePressed

            public void mouseReleased( MouseEvent e )
            {
               x2 = e.getX();
               y2 = e.getY();
               repaint();
            } // end method mouseReleased
         } // end anonymous inner class
      ); // end addMouseListener

      addMouseMotionListener(
         new MouseMotionAdapter() {
            public void mouseDragged( MouseEvent e )
            {
               x2 = e.getX();
               y2 = e.getY();
               repaint();
            } // end method mouseDragged
         } // end anonymous inner class
      ); // end addMouseMotionListener
   } // end SelfContainedPanel constructor

   public Dimension getPreferredSize()
   {
      return new Dimension( 150, 100 );
   } // end method getPreferredSize

   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      g.drawOval( Math.min( x1, x2 ), Math.min( y1, y2 ),
                  Math.abs( x1 - x2 ), Math.abs( y1 - y2 ) );
   } // end method paintComponent
} // end class SelfContainedPanel


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
