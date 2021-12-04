#include <iostream>
using namespace std;

class Box{
    public :
        double length;   
        double breadth; 
        double height;
};
int main(){
    Box box1;
    Box box2;
    double volume = 0.0;
    box1.height = 5.0;
    box1.length = 6.0;
    box1.breadth = 7.0;
    // volume 1
    volume = box1.height * box1.length * box1.breadth;
    std::cout << "Volume du box 1" <<volume<<std::endl;
    volume =box2.height*box2.length * box2.breadth;
    std::cout << "Volume Box 2" <<volume<< std::endl;
    return 0;
}