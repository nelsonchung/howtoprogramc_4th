// Fig. 23.2: fig23_02.cpp
// Demonstration of rethrowing an exception.
#include <iostream>

using std::cout;
using std::endl;

#include <exception>

using std::exception;

void throwException() 
{
   // Throw an exception and immediately catch it.
   try {
      cout << "Function throwException\n";
      throw exception();  // generate exception
   } // end try
   catch( exception e )
   {
      cout << "Exception handled in function throwException\n";
      throw;  // rethrow exception for further processing
   } // end catch

   cout << "This also should not print\n";
} // end function throwException

int main()
{
   try {
      throwException();
      cout << "This should not print\n";
   } // end try
   catch ( exception e )
   {
      cout << "Exception handled in main\n";
   } // end catch

   cout << "Program control continues after catch in main" 
        << endl;
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
