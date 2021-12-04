#include <iostream>
using namespace std;
class printData{
public:
    void print(int i)
    {
        cout << "Affiche int: " << i << endl;
    }
    void print(double f)
    {
        cout << "Affiche float: " << f << endl;
    }
    void print(char *c)
    {
        cout << "Affiche character: " << c << endl;
    }
};
int main(void){
    printData pd;
    pd.print(5);
    pd.print(500.263);
    pd.print("Hello C++");
    return 0;
}