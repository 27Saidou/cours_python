public class Rectangle1 extends Shape1{
    private double width;
    private double height;
    
    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return width * height; 
    }
    
}
