#include <iostream>
using namespace std;

// function declaration
int max(int num1, int num2);

int main()
{
    // local variable declaration:
    int a = 100;
    int b = 200;
    int res;

    // calling a function to get max value.
    res= max(a, b);
    cout << "Le maximum est de  : " << res<< endl;

    return 0;
}

// function returning the max between two numbers
int max(int num1, int num2)
{
    // local variable declaration
    int result;

    if (num1 > num2)
        result = num1;
    else
        result = num2;

    return result;
}