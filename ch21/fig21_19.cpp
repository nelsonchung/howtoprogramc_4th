// Fig. 21.19: fig21_19.cpp 
// Creating and testing user-defined, nonparameterized 
// stream manipulators.
#include <iostream>

using std::ostream;
using std::cout;
using std::flush;

// bell manipulator (using escape sequence \a)
ostream& bell( ostream& output ) { return output << '\a'; }

// ret manipulator (using escape sequence \r)
ostream& ret( ostream& output ) { return output << '\r'; }

// tab manipulator (using escape sequence \t)
ostream& tab( ostream& output ) { return output << '\t'; }

// endLine manipulator (using escape sequence \n
// and the flush member function)
ostream& endLine( ostream& output ) 
{ 
   return output << '\n' << flush;
} // end function endLine

int main()
{
   cout << "Testing the tab manipulator:" << endLine
        << 'a' << tab << 'b' << tab << 'c' << endLine
        << "Testing the ret and bell manipulators:"
        << endLine << "..........";
   cout << bell;
   cout << ret << "-----" << endLine;
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
