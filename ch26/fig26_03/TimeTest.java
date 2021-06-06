// Fig. 26.3: TimeTest.java
// Demonstrating the Time2 class set and get methods
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.deitel.chtp4.ch26.Time2;

public class TimeTest extends JApplet
                      implements ActionListener {
   private Time2 t;
   private JLabel hourLabel, minuteLabel, secondLabel;
   private JTextField hourField, minuteField,
                      secondField, display;
   private JButton tickButton;

   public void init()
   {
      t = new Time2();

      Container c = getContentPane();

      c.setLayout( new FlowLayout() );
      hourLabel = new JLabel( "Set Hour" );
      hourField = new JTextField( 10 );
      hourField.addActionListener( this );
      c.add( hourLabel );
      c.add( hourField );

      minuteLabel = new JLabel( "Set minute" );
      minuteField = new JTextField( 10 );
      minuteField.addActionListener( this );
      c.add( minuteLabel );
      c.add( minuteField );

      secondLabel = new JLabel( "Set Second" );
      secondField = new JTextField( 10 );
      secondField.addActionListener( this );
      c.add( secondLabel );
      c.add( secondField );

      display = new JTextField( 30 );
      display.setEditable( false );
      c.add( display );

      tickButton = new JButton( "Add 1 to Second" );
      tickButton.addActionListener( this );
      c.add( tickButton );

      updateDisplay();      
   } // end method init

   public void actionPerformed( ActionEvent e )
   {
      if ( e.getSource() == tickButton )
         tick();
      else if ( e.getSource() == hourField ) {
         t.setHour(
            Integer.parseInt( e.getActionCommand() ) );
         hourField.setText( "" );
      }
      else if ( e.getSource() == minuteField ) {
         t.setMinute(
            Integer.parseInt( e.getActionCommand() ) );
         minuteField.setText( "" );
      }
      else if ( e.getSource() == secondField ) {
         t.setSecond(
            Integer.parseInt( e.getActionCommand() ) );
         secondField.setText( "" );
      }

      updateDisplay();
   } // end method actionPerformed

   public void updateDisplay()
   {
      display.setText( "Hour: " + t.getHour() +
         "; Minute: " + t.getMinute() +
         "; Second: " + t.getSecond() );
      showStatus( "Standard time is: " + t.toString() +
         "; Universal time is: " + t.toUniversalString() );
   } // end method updateDisplay

   public void tick()
   {
      t.setSecond( ( t.getSecond() + 1 ) % 60 );

      if ( t.getSecond() == 0 ) {
         t.setMinute( ( t.getMinute() + 1 ) % 60 );

         if ( t.getMinute() == 0 )
            t.setHour( ( t.getHour() + 1 ) % 24 );
      } // end if
   } // end method tick
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

