// Fig. 28.21: DrawPolygons.java
// Drawing polygons
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawPolygons extends JFrame {
   public DrawPolygons()
   {
      super( "Drawing Polygons" );

      setSize( 275, 230 );
      show();
   } // end DrawPolygons constructor

   public void paint( Graphics g )
   {
      int xValues[] = { 20, 40, 50, 30, 20, 15 };
      int yValues[] = { 50, 50, 60, 80, 80, 60 };
      Polygon poly1 = new Polygon( xValues, yValues, 6 );

      g.drawPolygon( poly1 );

      int xValues2[] = { 70, 90, 100, 80, 70, 65, 60 };
      int yValues2[] = { 100, 100, 110, 110, 130, 110, 90 };

      g.drawPolyline( xValues2, yValues2, 7 );

      int xValues3[] = { 120, 140, 150, 190 };
      int yValues3[] = { 40, 70, 80, 60 };

      g.fillPolygon( xValues3, yValues3, 4 );

      Polygon poly2 = new Polygon();
      poly2.addPoint( 165, 135 );
      poly2.addPoint( 175, 150 );
      poly2.addPoint( 270, 200 );
      poly2.addPoint( 200, 220 );
      poly2.addPoint( 130, 180 );

      g.fillPolygon( poly2 );
   } // end method paint

   public static void main( String args[] )
   {
      DrawPolygons app = new DrawPolygons();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener
   } // end main
} // end class DrawPolygons

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
