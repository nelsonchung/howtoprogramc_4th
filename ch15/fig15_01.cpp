// Fig. 15.1: fig15_01.cpp
// Addition program
#include <iostream>

int main()
{
   int integer1;

   std::cout << "Enter first integer\n";  
   std::cin >> integer1;                      

   int integer2, sum;           // declaration

   std::cout << "Enter second integer\n";
   std::cin >> integer2;                  
   sum = integer1 + integer2;             
   std::cout << "Sum is " << sum << std::endl; 

   return 0;   // indicate that program ended successfully
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
