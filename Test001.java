class A {
    public void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void display() {
        System.out.println("Class B");
    }
}

public class Test001 {
    public static void main(String[] args) {
        A objA=new B();
        if (objA instanceof B) {
            ((B)objA).display();
        }
    }
}
