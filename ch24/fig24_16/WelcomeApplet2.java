// Fig. 24.16: WelcomeApplet2.java
// Displaying multiple strings
import javax.swing.JApplet;  // import class JApplet
import java.awt.Graphics;    // import class Graphics

public class WelcomeApplet2 extends JApplet {  
   public void paint( Graphics g )
   {
      g.drawString( "Welcome to", 25, 25 );
      g.drawString( "Java Programming!", 25, 40 );
   } // end method paint
} // end class WelcomeApplet2


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
