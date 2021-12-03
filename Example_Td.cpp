#include <iostream>
using namespace std;
int main(){
    char nom[20];
    int age;
    cout << "Saisir votre nom et age : ";
    cin >> nom;
    std::cout << "Votre nom est " <<nom <<std::endl;
    cin>> age;
    std::cout << "Your age is " << age << std::endl;

    return 0;
}