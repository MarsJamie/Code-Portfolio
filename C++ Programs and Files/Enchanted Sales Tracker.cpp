 /*========================================================

 Author:      <Mars-Jamie Dickerson>
 Date:        < 09 / 11 / 24 >
 Description: This program tracks the sales of artifacts in the shop and creates a invoice.txt file.

 ==========================================================
*/

#include <iostream>
#include <fstream>
using namespace std;

int main() {

// Defining the array

	int numOfDays;
// Prompt the user for the amount of Days

	cin >> numOfDays;
// Defining the array of salesPerDay "numOfDays"

	int salesPerDay[numOfDays];

	/* Using loop to move every array element and then using cin
	to insert the value given by the user to the array element
	*/
	for (int i = 0; i < numOfDays; i++) {
		cin >> salesPerDay[i];
	}

// Calculate Total, average, highest, lowest daily sales

// Total Sales
	double totalSales = 0;

	for (int i = 0; i < numOfDays; i++) {
		totalSales += salesPerDay[i];
	}
// Average Sales
	double averageSales = 0.00;

	for (int i = 0.00; i < numOfDays; i++) {
		averageSales = totalSales/numOfDays;
	}

// Highest Sales
	int highestSales = salesPerDay[0];

	for (int i = 0; i < numOfDays; i++) {
		if(salesPerDay[i] > highestSales)
			highestSales = salesPerDay[i];
	}

// Lowest Sales
	int lowestSales = salesPerDay[0];

	for (int i = 0; i < numOfDays; i++) {
		if(salesPerDay[i] < lowestSales)
			lowestSales = salesPerDay[i];
	}

// Output the sales report

// Write the sales report to a file named "invoice.txt"

	string invoiceS;

	ofstream InvoiceF2;

	InvoiceF2.open("invoice.txt");
	InvoiceF2 << '\n';
	InvoiceF2 << "Total Sales : " << totalSales << '\n';
	InvoiceF2 << "Average Sales : " << averageSales << '\n';
	InvoiceF2 << "Highest Sale : " << highestSales << '\n';
	InvoiceF2 << "Lowest Sale : " << lowestSales;
	InvoiceF2.close();

// Read and display the sales report from the "invoice.txt" file

	ifstream InvoiceF("invoice.txt");

	if (InvoiceF.is_open())
		cout << InvoiceF.rdbuf();
// End Program
	return 0;
}