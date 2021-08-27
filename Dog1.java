public class Dog1 extends Animal3 {
    public void makesound(){
        System.out.println("whoof");
    }
    public static void main(String[] args) {
        Animal3 dog1 = new Dog1();
        dog1.makesound();

    }
}
