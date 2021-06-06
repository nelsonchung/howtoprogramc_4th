// Fig. 15.11: fig15_11.cpp
// Using a function template
#include <iostream>

using std::cout;
using std::cin;
using std::endl;

template < class T >
T maximum( T value1, T value2, T value3 )
{
   T max = value1;

   if ( value2 > max )
      max = value2;

   if ( value3 > max )
      max = value3;

   return max;
} // end function template maximum

int main()
{
   int int1, int2, int3;

   cout << "Input three integer values: ";
   cin >> int1 >> int2 >> int3;
   cout << "The maximum integer value is: "
        << maximum( int1, int2, int3 );          // int version

   double double1, double2, double3;

   cout << "\nInput three double values: ";
   cin >> double1 >> double2 >> double3;
   cout << "The maximum double value is: "
        << maximum( double1, double2, double3 ); // double version

   char char1, char2, char3;

   cout << "\nInput three characters: ";
   cin >> char1 >> char2 >> char3;
   cout << "The maximum character value is: "
        << maximum( char1, char2, char3 )        // char version
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
