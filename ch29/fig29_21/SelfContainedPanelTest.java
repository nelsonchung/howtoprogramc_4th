// Fig. 29.21: SelfContainedPanelTest.java
// Creating a self-contained subclass of JPanel 
// that processes its own mouse events.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.deitel.chtp4.ch29.SelfContainedPanel;

public class SelfContainedPanelTest extends JFrame {
   private SelfContainedPanel myPanel;

   public SelfContainedPanelTest()
   {
      myPanel = new SelfContainedPanel();   
      myPanel.setBackground( Color.yellow );

      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      c.add( myPanel );

      addMouseMotionListener(
         new MouseMotionListener() {
            public void mouseDragged( MouseEvent e )
            {
               setTitle( "Dragging: x=" + e.getX() +
                         "; y=" + e.getY() );
            } // end method mouseDragged

            public void mouseMoved( MouseEvent e )
            {
               setTitle( "Moving: x=" + e.getX() +
                         "; y=" + e.getY() );
            } // end method mouseMoved
         } // end anonymous inner class
      ); // end addMouseMotionListener

      setSize( 300, 200 );
      show();
   } // end SelfContainedPanelTest constructor

   public static void main( String args[] )
   {
      SelfContainedPanelTest app =
         new SelfContainedPanelTest();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener
   } // end main
} // end class SelfContainedPanelTest


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
