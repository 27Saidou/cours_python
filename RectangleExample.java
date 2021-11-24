public class RectangleExample implements Polygon {

    @Override
    public void getAire(int length, int breadth) {
        System.out.println("L'aire du rectangle est :"+(length*breadth));
        
    }
    
    @Override
    public void getName(String name) {
        System.out.println("Langage de Programmation "+name);
        
    }
    
    public void getSides() {
        System.out.println("J'ai 4 cotes");
    }
    

    public static void main(String[] args) {
        RectangleExample r1=new RectangleExample();
        r1.getAire(5,6);
        r1.getName("java");
        r1.getSides();
    }
}
