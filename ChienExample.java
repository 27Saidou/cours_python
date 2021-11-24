public class ChienExample extends Ani {
    @Override
    public void eat() {
        super.eat();
        System.out.println("je mange de la nourriture pour chien");
    }
    public void bark() {
        System.out.println("je peux aboyer");
    }

    public void display() {
        System.out.println("je m'appelle " + this.name);
    }
}
