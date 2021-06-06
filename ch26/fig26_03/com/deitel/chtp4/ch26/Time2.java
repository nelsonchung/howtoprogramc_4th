// Fig. 26.3: Time2.java
// Time2 class definition
package com.deitel.chtp4.ch26;   // place Time2 in a package
import java.text.DecimalFormat;  // used for number formatting

// This class maintains the time in 24-hour format
public class Time2 extends Object {
   private int hour;     // 0 - 23
   private int minute;   // 0 - 59
   private int second;   // 0 - 59

   // Time2 constructor initializes each instance variable
   // to zero. Ensures that Time object starts in a 
   // consistent state.
   public Time2() { setTime( 0, 0, 0 ); }

   // Set Methods
   // Set a new time value using universal time. Perform 
   // validity checks on the data. Set invalid values to zero.
   public void setTime( int h, int m, int s )
   {
      setHour( h );    // set the hour
      setMinute( m );  // set the minute
      setSecond( s );  // set the second
   } // end method setTime

   // set the hour 
   public void setHour( int h ) 
      { hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); }

   // set the minute 
   public void setMinute( int m ) 
      { minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); }

   // set the second 
   public void setSecond( int s ) 
      { second = ( ( s >= 0 && s < 60 ) ? s : 0 ); }

   // Get Methods
   // get the hour
   public int getHour() { return hour; }

   // get the minute
   public int getMinute() { return minute; }

   // get the second
   public int getSecond() { return second; }

   // Convert to String in universal-time format
   public String toUniversalString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return twoDigits.format( getHour() ) + ":" +
             twoDigits.format( getMinute() ) + ":" +
             twoDigits.format( getSecond() );
   } // end method toUniversalString

   // Convert to String in standard-time format
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return ( ( getHour() == 12 || getHour() == 0 ) ? 
               12 : getHour() % 12 ) + ":" +
             twoDigits.format( getMinute() ) + ":" +
             twoDigits.format( getSecond() ) +
             ( getHour() < 12 ? " AM" : " PM" );
   } // end method toString
} // end class Time2


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
