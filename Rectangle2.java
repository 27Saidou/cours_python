public class Rectangle2 extends Shape {
    double length;
    double width;
    
    public Rectangle2(String color, double length, double width) {
        super(color);
        System.out.println("Constructeur de la class Rectangle!!!");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {

        return length*width;
    }

    @Override
    public String toString() {

        return "La couleur du rectangle est" + super.getColor() +" est area is:"+ area();
    }
    
}
