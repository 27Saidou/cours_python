public class Animaux {
    boolean vivant;
    int age;
    int ageMaxi = 10;

    Animaux(int a) {
        age = a;
        vivant = true;
        System.out.println("Un animal de " + a + " an(s) vient d'être créé");
    }

    Animaux() {
        this(1);
    }

    void vieillit(int a) {
        age += a;
        if (age > ageMaxi)
            meurt();
        else {
            System.out.println("C'est l'anniversaire de cet animal.");
            System.out.println("Il a maintenant " + age + " an(s)");
        }
    }

    void vieillit() {
        vieillit(1);
    }

    void meurt() {
        vivant = false;
        System.out.println("Cet animal est mort");
    }

    void crie() {
    }
}
