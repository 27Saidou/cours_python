abstract class Animal
{
    
    public Animal() {
        System.out.println("You are creating a new Animal");
    }
    abstract void walk();
    public void mange(){
        System.out.println("un Animal mange");
    }
}
class Horse extends Animal{
    
    public Horse() {
        System.out.println("You created a Horse");
    }

    @Override
    void walk() {
    System.out.println("marche avec quatre(4) jambes");
        
    }
    
}
class Chicken extends Animal{

    @Override
    void walk() {
        System.out.println("Marche avec deux(2)jambes ");
        
    }
    
}
public class OOPS2 {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        horse.mange();
        Chicken chicken=new Chicken();
        chicken.walk();
    }
}
