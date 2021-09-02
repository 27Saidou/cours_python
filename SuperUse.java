public class SuperUse {
    /* l existe trois utilisations du mot clé super en Java :
    1.
    Nous pouvons
    invoquer les
    variables de
    la superclasse.

    2.
    Nous pouvons
    invoquer les
    méthodes de
    la superclasse.

    3.
    Nous pouvons
    invoquer le
    constructeur de
    la superclasse*/
    public static void main(String[] args) {
        SubClass enfant= new SubClass();
        enfant.display();
    }
}
