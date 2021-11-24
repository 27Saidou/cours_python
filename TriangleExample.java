
import java.lang.Math;

interface Polygone {
    void getArea();

    // calculate the perimeter of a Polygon
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);
    }
}
public class TriangleExample implements Polygone {
    private int a, b, c;
    private double s, area;
    
    TriangleExample(int a, int b, int c, double s) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;

    }
    
    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        TriangleExample t1 = new TriangleExample(2,3,4,10.0);
        t1.getArea();
        t1.getPerimeter(2,3,4);
    }
}
