#include <iostream>
using namespace std;

int sum(int a, int b = 20)
{
    int result;
    result = a + b;

    return (result);
}
int main()
{
    // local variable declaration:
    int a = 100;
    int b = 200;
    int result;

    // calling a function to add the values.
    result = sum(a, b);
    cout << "Total valeur est de  :" << result << endl;

    // calling a function again as follows.
    result = sum(a);
    cout << "Total valeur est de  :" << result << endl;

    return 0;
}