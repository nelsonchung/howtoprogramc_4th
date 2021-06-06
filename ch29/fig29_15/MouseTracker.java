// Fig. 29.15: MouseTracker.java
// Demonstrating mouse events.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTracker extends JFrame
             implements MouseListener, MouseMotionListener {
   private JLabel statusBar;

   public MouseTracker()
   {
      super( "Demonstrating Mouse Events" );

      statusBar = new JLabel();
      getContentPane().add( statusBar, BorderLayout.SOUTH );
    
      // application listens to its own mouse events
      addMouseListener( this );
      addMouseMotionListener( this );

      setSize( 275, 100 );
      show();
   } // end MouseTracker constructor

   // MouseListener event handlers
   public void mouseClicked( MouseEvent e )
   {
      statusBar.setText( "Clicked at [" + e.getX() +
                         ", " + e.getY() + "]" );
   } // end method mouseClicked

   public void mousePressed( MouseEvent e )
   {
      statusBar.setText( "Pressed at [" + e.getX() +
                         ", " + e.getY() + "]" );
   } // end method mousePressed

   public void mouseReleased( MouseEvent e )
   {
      statusBar.setText( "Released at [" + e.getX() +
                         ", " + e.getY() + "]" );
   } // end method mouseReleased

   public void mouseEntered( MouseEvent e )
   {
      statusBar.setText( "Mouse in window" );
   } // end method mouseEntered

   public void mouseExited( MouseEvent e )
   {
      statusBar.setText( "Mouse outside window" );
   } // end method mouseExited

   // MouseMotionListener event handlers
   public void mouseDragged( MouseEvent e )
   {
      statusBar.setText( "Dragged at [" + e.getX() +
                         ", " + e.getY() + "]" );
   } // end method mouseDragged

   public void mouseMoved( MouseEvent e )
   {
      statusBar.setText( "Moved at [" + e.getX() +
                         ", " + e.getY() + "]" );
   } // end method mouseMoved

   public static void main( String args[] )
   { 
      MouseTracker app = new MouseTracker();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener
   } // end main 
} // end class MouseTracker


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

