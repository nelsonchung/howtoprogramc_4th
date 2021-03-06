// Fig. 18.3: fig18_03.cpp
// Overloading the stream-insertion and 
// stream-extraction operators.
#include <iostream>

using std::cout;
using std::cin;
using std::endl;
using std::ostream;
using std::istream;

#include <iomanip>

using std::setw;

class PhoneNumber {
   friend ostream &operator<<( ostream&, const PhoneNumber & );
   friend istream &operator>>( istream&, PhoneNumber & );

private:
   char areaCode[ 4 ];  // 3-digit area code and null
   char exchange[ 4 ];  // 3-digit exchange and null
   char line[ 5 ];      // 4-digit line and null
}; // end class PhoneNumber

// Overloaded stream-insertion operator (cannot be 
// a member function if we would like to invoke it with
// cout << somePhoneNumber;).
ostream &operator<<( ostream &output, const PhoneNumber &num )
{
   output << "(" << num.areaCode << ") "
          << num.exchange << "-" << num.line;
   return output;     // enables cout << a << b << c;
} // end operator<< function

istream &operator>>( istream &input, PhoneNumber &num )
{
   input.ignore();                     // skip (
   input >> setw( 4 ) >> num.areaCode; // input area code
   input.ignore( 2 );                  // skip ) and space
   input >> setw( 4 ) >> num.exchange; // input exchange
   input.ignore();                     // skip dash (-)
   input >> setw( 5 ) >> num.line;     // input line
   return input;      // enables cin >> a >> b >> c;
} // end operator>> function

int main()
{
   PhoneNumber phone; // create object phone

   cout << "Enter phone number in the form (123) 456-7890:\n";

   // cin >> phone invokes operator>> function by 
   // issuing the call operator>>( cin, phone ).
   cin >> phone;

   // cout << phone invokes operator<< function by
   // issuing the call operator<<( cout, phone ). 
   cout << "The phone number entered was: " << phone << endl;
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
