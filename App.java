import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Pomme(60));
        fruits.add(new Orange(90));
        fruits.add(new Pomme(90));
        for (int i = 0; i < fruits.size(); i++) {
            fruits.get(i).affiche();

        }
        for (Fruit fruit : fruits) {
            fruit.affiche();
            fruit.afficherPoids();
        }
    }
}
