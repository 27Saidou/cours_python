interface Polygonne {
    public void display();
}

class AnonymousDemo {
    public void createClass() {
        Polygonne p1 = new Polygonne() {
            public void display() {
                System.out.println("Dans une classe anonyme.");
            }
        };
        p1.display();
    }
}
public class ApplicationMain {
    public static void main(String[] args) {
        AnonymousDemo ano=new AnonymousDemo();
        ano.createClass();
    }
}
