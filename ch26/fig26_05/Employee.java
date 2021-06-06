// Fig. 26.5: Employee.java
// Declaration of the Employee class.
public class Employee extends Object {
   private String firstName;
   private String lastName;
   private static int count;  // # of objects in memory

   public Employee( String fName, String lName )
   {
      firstName = fName;
      lastName = lName;

      ++count;  // increment static count of employees
      System.out.println( "Employee object constructor: " +
                          firstName + " " + lastName );
   } // end Employee constructor

   protected void finalize()
   {
      --count;  // decrement static count of employees
      System.out.println( "Employee object finalizer: " +
                          firstName + " " + lastName +
                          "; count = " + count );
   } // end method finalize

   public String getFirstName() { return firstName; }

   public String getLastName() { return lastName; }

   public static int getCount() { return count; } 
} // end class Employee


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
