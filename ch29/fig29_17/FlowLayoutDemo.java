// Fig. 29.17: FlowLayoutDemo.java
// Demonstrating FlowLayout alignments.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
   private JButton left, center, right;
   private Container c;
   private FlowLayout layout;
   
   public FlowLayoutDemo()
   {
      super( "FlowLayout Demo" );

      layout = new FlowLayout();

      c = getContentPane();
      c.setLayout( layout );

      left = new JButton( "Left" );
      left.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               layout.setAlignment( FlowLayout.LEFT );

               // re-align attached components
               layout.layoutContainer( c );  
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener
      c.add( left );

      center = new JButton( "Center" );
      center.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               layout.setAlignment( FlowLayout.CENTER );

               // re-align attached components
               layout.layoutContainer( c );  
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener
      c.add( center );

      right = new JButton( "Right" );
      right.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               layout.setAlignment( FlowLayout.RIGHT );

               // re-align attached components
               layout.layoutContainer( c );  
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener
      c.add( right );

      setSize( 300, 75 );
      show();
   } // end FlowLayoutDemo constructor

   public static void main( String args[] )
   { 
      FlowLayoutDemo app = new FlowLayoutDemo();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener
   } // end main
} // end class FlowLayoutDemo


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
