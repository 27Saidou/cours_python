import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vect = new Vector<String>();
        vect.addElement("Java");
        vect.addElement("Pascal");
        vect.addElement("PHP");
        vect.addElement("C++");
        System.out.println("Taille du vecteur: " + vect.size());
        System.out.println("Capacite du vecteur: " + vect.capacity());
        System.out.println("Premier element: " + vect.firstElement());
        System.out.println("Dernier element: " + vect.lastElement());

        if (vect.contains("Java"))
            System.out.println("Le vecteur contient Java.");

        // énumérer les éléments du vecteur.
        Enumeration<String> e = vect.elements();
        System.out.println("\nLes elements dans le vecteur:");

        while (e.hasMoreElements())
            System.out.print(e.nextElement() + " ");
        System.out.println();
    }
}
