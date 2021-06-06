// Fig. 29.9: TextAreaDemo.java
// Copying selected text from one text area to another.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame {
   private JTextArea t1, t2;
   private JButton copy;

   public TextAreaDemo() 
   {
      super( "TextArea Demo" );

      Box b = Box.createHorizontalBox();

      String s = "This is a demo string to\n" +
                 "illustrate copying text\n" +
                 "from one TextArea to \n" +
                 "another TextArea using an\n"+
                 "external event\n";

      t1 = new JTextArea( s, 10, 15 );
      b.add( new JScrollPane( t1 ) );

      copy = new JButton( "Copy >>>" );
      copy.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               t2.setText( t1.getSelectedText() );
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener
      b.add( copy );

      t2 = new JTextArea( 10, 15 );
      t2.setEditable( false );
      b.add( new JScrollPane( t2 ) );

      Container c = getContentPane();
      c.add( b ); 
      setSize( 425, 200 );
      show();
   } // end TextAreaDemo constructor

   public static void main( String args[] )
   {
      TextAreaDemo app = new TextAreaDemo();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener
   } // end main
} // end class TextAreaDemo



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

