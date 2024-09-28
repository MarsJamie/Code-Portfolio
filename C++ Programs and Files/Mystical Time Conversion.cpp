 /*========================================================
 
 Author:      < Mars-Jamie Dickerson >
 Date:        < 09 / 03 / 24 >
 Description: This program ask the user for a fantasy world name
 and the local Earth hours and minutes and converts it to Phases and Echoes)

 ==========================================================
*/

//conversion:
// 10 Earth hours = 1 Phases
// 30 Earth mintues = 1 Echoes

#include<iostream>
using namespace std;

int main() {

	//Variables

	int earthHrs;
	int earthMins;
	int phases;
	int echoes;
	int remainder;
	string worldName;

	//Program:
	
	//Ask for World Name

    cout << "What is your World Name?";
	cin >> worldName;

	//Gets Earth Hours and Minutes

    cout << "What time is it on Earth?";
	cin >> earthHrs;
	cin >> earthMins;
	
    //Conversion

    remainder = earthHrs % 10;
    phases = earthHrs / 10;
    echoes = (earthMins + remainder*60)/30;
    
    //End program

	cout << "The time in " << worldName << " is: " << phases << " phase(s) " << echoes << " echo(es)" << '\n';
	return 0;
}