// Fig. 27.7: TimeTestWindow.java
// Demonstrating the Time class set and get methods
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeTestWindow extends JFrame {
   private Time t;
   private JLabel hourLabel, minuteLabel, secondLabel;
   private JTextField hourField, minuteField,
                      secondField, display;

   public TimeTestWindow()
   {
      super( "Inner Class Demonstration" );

      t = new Time();

      Container c = getContentPane();

      c.setLayout( new FlowLayout() );
      hourLabel = new JLabel( "Set Hour" );
      hourField = new JTextField( 10 );
      hourField.addActionListener( 
         new ActionListener() {  // anonymous inner class
            public void actionPerformed( ActionEvent e )
            {
               t.setHour(
                  Integer.parseInt( e.getActionCommand() ) );
               hourField.setText( "" );
               displayTime();
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener
      c.add( hourLabel );
      c.add( hourField );

      minuteLabel = new JLabel( "Set minute" );
      minuteField = new JTextField( 10 );
      minuteField.addActionListener( 
         new ActionListener() {  // anonymous inner class
            public void actionPerformed( ActionEvent e )
            {
               t.setMinute(
                  Integer.parseInt( e.getActionCommand() ) );
               minuteField.setText( "" );
               displayTime();
            }
         }
      );
      c.add( minuteLabel );
      c.add( minuteField );

      secondLabel = new JLabel( "Set Second" );
      secondField = new JTextField( 10 );
      secondField.addActionListener( 
         new ActionListener() {  // anonymous inner class
            public void actionPerformed( ActionEvent e )
            {
               t.setSecond(
                  Integer.parseInt( e.getActionCommand() ) );
               secondField.setText( "" );
               displayTime();
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end addActionListener
      c.add( secondLabel );
      c.add( secondField );

      display = new JTextField( 30 );
      display.setEditable( false );
      c.add( display );
   } // end TimeTestWindow constructor

   public void displayTime()
   {
      display.setText( "The time is: " + t );
   } // end method displayTime

   public static void main( String args[] )
   {
      TimeTestWindow window = new TimeTestWindow();

      window.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener

      window.setSize( 400, 120 );
      window.show();
   } // end main
} // end class TimeTestWindow


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