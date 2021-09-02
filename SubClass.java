public class SubClass extends SuperClass {
    int i=100;
    void display(){
        super.display();
        System.out.println("methode de la super Class");
        System.out.println("i value ="+i);
        System.out.println("super Class="+super.i);
    }
}
