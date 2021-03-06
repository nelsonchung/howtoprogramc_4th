// ex15_04.cpp
// Inline function that calculates the volume of a sphere
#include <iostream>

using std::cout;
using std::cin;
using std::endl;

#include <cmath>

const double PI = 3.14159;

inline double sphereVolume( const double r ) 
   { return 4.0 / 3.0 * PI * pow( r, 3 ); }

int main()
{
   double radius;

   cout << "Enter the length of the radius of your sphere: ";
   cin >> radius;
   cout << "Volume of sphere with radius " << radius << 
           " is " << sphereVolume( radius ) << endl;
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
