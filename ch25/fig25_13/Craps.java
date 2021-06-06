// Fig. 25.13: Craps.java
// Craps
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Craps extends JApplet implements ActionListener {
   // constant variables for status of game
   final int WON = 0, LOST = 1, CONTINUE = 2;  

   // other variables used in program
   boolean firstRoll = true;   // true if first roll
   int sumOfDice = 0;          // sum of the dice
   int myPoint = 0;   // point if no win/loss on first roll
   int gameStatus = CONTINUE;  // game not over yet

   // graphical user interface components 
   JLabel die1Label, die2Label, sumLabel, pointLabel;
   JTextField firstDie, secondDie, sum, point;
   JButton roll;

   // setup graphical user interface components
   public void init()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );      

      die1Label = new JLabel( "Die 1" );
      c.add( die1Label );
      firstDie = new JTextField( 10 );
      firstDie.setEditable( false );
      c.add( firstDie );

      die2Label = new JLabel( "Die 2" );
      c.add( die2Label );
      secondDie = new JTextField( 10 );
      secondDie.setEditable( false );
      c.add( secondDie );

      sumLabel = new JLabel( "Sum is" );
      c.add( sumLabel );
      sum = new JTextField( 10 );
      sum.setEditable( false );
      c.add( sum );

      pointLabel = new JLabel( "Point is" );
      c.add( pointLabel );
      point = new JTextField( 10 );
      point.setEditable( false );
      c.add( point );

      roll = new JButton( "Roll Dice" );
      roll.addActionListener( this );
      c.add( roll );
   } // end method init

   // call method play when button is pressed
   public void actionPerformed( ActionEvent e )
   {
      play();
   } // end method actionPerformed
   
   // process one roll of the dice
   public void play()
   {
      if ( firstRoll ) {             // first roll of the dice
         sumOfDice = rollDice();        
   
         switch ( sumOfDice ) {
            case 7: case 11:         // win on first roll
               gameStatus = WON;
               point.setText( "" );  // clear point text field
               break;
            case 2: case 3: case 12: // lose on first roll
               gameStatus = LOST;
               point.setText( "" );  // clear point text field
               break;
            default:                 // remember point
               gameStatus = CONTINUE;
               myPoint = sumOfDice;
               point.setText( Integer.toString( myPoint ) );
               firstRoll = false;
               break;
         } // end switch
      } // end if
      else {
         sumOfDice = rollDice();
      
         if ( sumOfDice == myPoint )    // win by making point
            gameStatus = WON;
         else
            if ( sumOfDice == 7 )       // lose by rolling 7
               gameStatus = LOST;
      } // end else

      if ( gameStatus == CONTINUE )
         showStatus( "Roll again." );
      else {
         if ( gameStatus == WON )
            showStatus( "Player wins. " +
               "Click Roll Dice to play again." );
         else 
            showStatus( "Player loses. " + 
               "Click Roll Dice to play again." );
         
         firstRoll = true;
      } // end else
   } // end method play

   // roll the dice
   public int rollDice()
   {
      int die1, die2, workSum;   

      die1 = 1 + ( int ) ( Math.random() * 6 );
      die2 = 1 + ( int ) ( Math.random() * 6 );
      workSum = die1 + die2;

      firstDie.setText( Integer.toString( die1 ) );
      secondDie.setText( Integer.toString( die2 ) );
      sum.setText( Integer.toString( workSum ) );

      return workSum;
   } // end method rollDice
} // end class Craps


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
