public abstract class Fruit {
    protected int poids;

    public Fruit() {
        System.out.println("creation d'un fruits");
    }

    public abstract void affiche();
    public abstract void afficherPoids();
}
