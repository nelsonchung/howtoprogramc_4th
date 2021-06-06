// Fig. 25.19: StudentPoll.java
// Student poll program
import javax.swing.*;

public class StudentPoll {
   public static void main( String args[] )
   {
      int responses[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10,
                          1, 6, 3, 8, 6, 10, 3, 8, 2, 7,
                          6, 5, 7, 6, 8, 6, 7, 5, 6, 6,
                          5, 6, 7, 5, 6, 4, 8, 6, 8, 10 };
      int frequency[] = new int[ 11 ];
      String output = "";

      for ( int answer = 0;                  // initialize
            answer < responses.length;       // condition
            answer++ )                       // increment
         ++frequency[ responses[ answer ] ];

      output += "Rating\tFrequency\n";
   
      for ( int rating = 1;
            rating < frequency.length;
            rating++ )
         output += rating + "\t" + frequency[ rating ] + "\n";

      JTextArea outputArea = new JTextArea( 11, 10 );
      outputArea.setText( output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Student Poll Program",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   } // end main
} // end class StudentPoll


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

