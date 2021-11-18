public class Circle1 extends Shape1 {
    private double radius;
    
    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
