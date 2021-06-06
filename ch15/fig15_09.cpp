// Fig. 15.9: fig15_09.cpp
// Using the unary scope resolution operator
#include <iostream>

using std::cout;
using std::endl;
using std::ios;

#include <iomanip>

using std::setprecision;
using std::setiosflags;
using std::setw;

const double PI = 3.14159265358979;

int main()
{
   const float PI = static_cast< float >( ::PI );

   cout << setprecision( 20 )
        << "  Local float value of PI = " << PI
        << "\nGlobal double value of PI = " << ::PI << endl;

   cout << setw( 28 ) << "Local float value of PI = " 
        << setiosflags( ios::fixed | ios::showpoint )
        << setprecision( 10 ) << PI << endl;
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
