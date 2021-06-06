// Fig. 8.12: EmployeeTest.java
// Test Employee class with static class variable,
// static class method, and dynamic memory.
import javax.swing.*;

public class EmployeeTest {
   public static void main( String args[] )
   {
      String output;

      output = "Employees before instantiation: " +
               Employee.getCount();

      Employee e1 = new Employee( "Susan", "Baker" );
      Employee e2 = new Employee( "Bob", "Jones" );
   
      output += "\n\nEmployees after instantiation: " +
                "\nvia e1.getCount(): " + e1.getCount() +
                "\nvia e2.getCount(): " + e2.getCount() +
                "\nvia Employee.getCount(): " +
                Employee.getCount();
   
      output += "\n\nEmployee 1: " + e1.getFirstName() +
                " " + e1.getLastName() +
                "\nEmployee 2: " + e2.getFirstName() +
                " " + e2.getLastName();

      // mark objects referred to by e1 and e2
      // for garbage collection
      e1 = null;  
      e2 = null;

      System.gc(); // suggest that garbage collector be called

      output += "\n\nEmployees after System.gc(): " +
                Employee.getCount();

      JOptionPane.showMessageDialog( null, output,
         "Static Members and Garbage Collection",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   } // end main
} // end class EmployeeTest


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
