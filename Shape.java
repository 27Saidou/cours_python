public abstract class Shape {
    String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color) {
        System.out.println("Appelle du constructeur de la class Forme");
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    
    
}
