#include <iostream>
#include <string>
using namespace std;
class Personne
{
public:
    string nom;
    string prenom;
    int age;
    void afficher();

};

void Personne::afficher(){
count<<"Nom:"<<nom<<endl;
count<<" Prenom: " <<prenom<<endl;
count <<"Age: " <<age<<endl;


}

int main()
{
    Personne p;
    p.nom='Diallo';
    p.prenom='Alpha';
    p.age=23;
    p.afficher();
    cout << "Hello world!" << endl;
    return 0;
}