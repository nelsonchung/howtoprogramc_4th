// Fig. 27.4: Point.java
// Definition of class Point

public class Point extends Shape {
   protected int x, y; // coordinates of the Point

   // no-argument constructor
   public Point() { setPoint( 0, 0 ); }

   // constructor
   public Point( int a, int b ) { setPoint( a, b ); }

   // Set x and y coordinates of Point
   public void setPoint( int a, int b )
   {
      x = a;
      y = b;
   } // end method setPoint

   // get x coordinate
   public int getX() { return x; }

   // get y coordinate
   public int getY() { return y; }

   // convert the point into a String representation
   public String toString() 
      { return "[" + x + ", " + y + "]"; }

   // return the class name 
   public String getName() { return "Point"; }
} // end class Point


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