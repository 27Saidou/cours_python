#include <iostream>
using namespace std;

// first name space
namespace first_space
{
    void func()
    {
        cout << "Je suis un developpeur python" << endl;
    }
}

// second name space
namespace second_space
{
    void func()
    {
        cout << "je suis un developpeur java" << endl;
    }
}

int main()
{

    first_space::func();
    second_space::func();

    return 0;
}