// fig21_18.cpp 
// Demonstrating the width member function
#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int main()
{
   int w = 4;
   char string[ 10 ];

   cout << "Enter a sentence:\n";
   cin.width( 5 );

   while ( cin >> string ) {
      cout.width( w++ );
      cout << string << endl;
      cin.width( 5 );
   } // end while

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
