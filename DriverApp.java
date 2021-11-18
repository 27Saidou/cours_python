public class DriverApp {
    public static void main(String[] args) {
        Shape1[]shape=new Shape1[2];
        shape[0] = new Circle1(2); 
        shape[1] = new Rectangle1(2, 2);
        System.out.println(" Area of circle is :" +shape[0].getArea());
        System.out.println("Area of the Rectangle: " + shape[1].getArea());
    }
}
