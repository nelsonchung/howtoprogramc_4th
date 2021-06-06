// Fig. 27.5: Cylinder.java
// Definition of class Cylinder

public class Cylinder extends Circle {
   protected double height;  // height of Cylinder
   
   // no-argument constructor
   public Cylinder()      
   {
      // implicit call to superclass constructor here
      setHeight( 0 );
   } // end Cylinder constructor

   // constructor
   public Cylinder( double h, double r, int a, int b )      
   {
      super( r, a, b );   // call superclass constructor
      setHeight( h );
   } // end Cylinder constructor

   // Set height of Cylinder
   public void setHeight( double h )
      { height = ( h >= 0 ? h : 0 ); }
   
   // Get height of Cylinder
   public double getHeight() { return height; }

   // Calculate area of Cylinder (i.e., surface area)
   public double area()
   {
      return 2 * super.area() +
             2 * Math.PI * radius * height;
   } // end method area
   
   // Calculate volume of Cylinder
   public double volume() { return super.area() * height; }

   // Convert a Cylinder to a String
   public String toString()
      { return super.toString() + "; Height = " + height; }

   // Return the class name
   public String getName() { return "Cylinder"; }
} // end class Cylinder


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