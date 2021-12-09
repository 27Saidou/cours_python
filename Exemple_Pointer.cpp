#include <iostream>
using namespace std;
void test(int *,int *);
int main(){
    int a=5,b=5;
    std::cout << "Avant de changer" << std::endl;
    std::cout << "a=" <<a<< std::endl;
    std::cout << "b=" << b<< std::endl;
    test(&a,&b);
    std::cout << "\"Apres changement" << std::endl;
    std::cout << "a=" <<a<< std::endl;
    std::cout << "b=" <<b<<std::endl;
    return 0;
}
void test(int *n1, int *n2){
    *n1 =10;
    *n2 =11;
}