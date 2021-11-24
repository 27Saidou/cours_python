class Animal_18 {
    public void displayInfo() {
        System.out.println("Je suis un animal.");
    }
}

class Dog_18 extends Animal_18 {
    @Override
    public void displayInfo() {
        System.out.println("Je suis un Chien.");
    }
    public void printMessage(){
        displayInfo();
    }
}

public class StaffMain {
    public static void main(String[] args) {
        Dog_18 d1=new Dog_18();
        d1.printMessage();
    }
}
