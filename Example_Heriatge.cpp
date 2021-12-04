#include <iostream>
using namespace std;
class Forme{
public:
    void setWidth(int w)
    {
        width = w;
    }
    void setHeight(int h)
    {
        height = h;
    }

protected:
    int width;
    int height;
};
class PaintCost
{
public:
    int getCost(int area)
    {
        return area * 70;
    }
};
class Rectangle:public Forme,public PaintCost{
public: int getArea() {
    return(width *height);
}
};
int main(void){
    Rectangle R1;
    int area;
    R1.setWidth(5);
    R1.setHeight(7);
    area = R1.getArea();
    std::cout << "Total area est de :" <<R1.getArea()<<std::endl;
    std::cout << "Total paintCost:"<< R1.getCost(area)<<std::endl;
    return 0;
}