 /*========================================================
 
 Author:      <Mars-Jamie Dickerson>
 Date:        < 09 / 04 / 24 >
 Description: This program takes numbers and decodes a message from the numbers

 ==========================================================
*/

#include<iostream>
using namespace std;

int main() {

	// Variable(s)

	int mysteryNum;

	// Prompt

	cin >> mysteryNum;

	// Program

	if (mysteryNum % 2 == 0 && mysteryNum % 3 == 0 && mysteryNum % 5 == 0 ) {
		cout << "G";
	} else if (mysteryNum % 3 == 0 && mysteryNum % 5 == 0) {
		cout << "F";
	} else if (mysteryNum % 2 == 0 && mysteryNum % 5 == 0) {
		cout << "E";
	} else if (mysteryNum % 2 == 0 && mysteryNum % 3 == 0) {
		cout << "D";
	} else if (mysteryNum % 5 == 0) {
		cout << "C";
	} else if (mysteryNum % 3 == 0) {
		cout << "B";
	} else if (mysteryNum % 2 == 0) {
		cout << "A";
	} else {
		cout << "X";
	}

	// End Program

	return 0;
}