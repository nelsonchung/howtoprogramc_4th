// Fig. 21.8: fig21_08.cpp
// Printing the address stored in a char* variable
#include <iostream>

using std::cout;
using std::endl;

int main()
{
   const char *string = "test";

   cout << "Value of string is: " << string
        << "\nValue of static_cast< void * >( string ) is: " 
        << static_cast< void * >( string ) << endl;
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
