public class Dog  extends Animal{
    public void AnimalSound() {
        System.out.println("Woof");
    }
    public static void main(String[] args) {
        Animal a=new Dog();
        a.AnimalSound();
    }
}
