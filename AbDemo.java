public class AbDemo {
    public static void main(String[] args) {
    MaeshPhone obj = new SureshPhone();
    obj.call();
    obj.cook();
    obj.move();
    obj.dance();
    }
}

abstract class MaeshPhone {
    public void call() {
        System.out.println("calling.....");
    }

    abstract void dance();

    abstract void move();

    abstract void cook();
}

class SureshPhone extends MaeshPhone {

    @Override
    void cook() {
        System.out.println("cooking.....");

    }

    @Override
    void dance() {
        System.out.println("dancing.....");

    }

    @Override
    void move() {
        System.out.println("moving.....");

    }

}
