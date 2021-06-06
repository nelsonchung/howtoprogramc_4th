// Fig. 23.3: fig23_03.cpp
// Demonstrating stack unwinding.
#include <iostream>

using std::cout;
using std::endl;

#include <stdexcept>

using std::runtime_error;

void function3() throw ( runtime_error )
{
   throw runtime_error( "runtime_error in function3" );
} // end function function3

void function2() throw ( runtime_error )
{
   function3();
} // end function function2

void function1() throw ( runtime_error )
{
   function2();
} // end function function1

int main()
{
   try {
      function1();
   } // end try
   catch ( runtime_error e )
   {
      cout << "Exception occurred: " << e.what() << endl;
   } // end catch

   return 0;
} // end function main



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
