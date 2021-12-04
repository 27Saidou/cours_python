#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    char data[100];

    // open 
    ofstream outfile;
    outfile.open("afile.dat");

    cout << "Ecriture sur le fichier" << endl;
    cout << "Entrez votre name: ";
    cin.getline(data, 100);

    // Ecriture
    outfile << data << endl;

    cout << "Entrez votre age : ";
    cin >> data;
    cin.ignore();
    outfile << data << endl;

    // close
    outfile.close();

    ifstream infile;
    infile.open("afile.dat");

    cout << "Lire Fichier" << endl;
    infile >> data;

    cout << data << endl;

    infile >> data;
    cout << data << endl;

    // close
    infile.close();

    return 0;
}