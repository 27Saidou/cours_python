import java.util.*;
// example de liskedList en java
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String>listes = new LinkedList<String>();
        // ajouter des elements dans la list
        listes.add("Pascal");
        listes.add("C++");
        listes.addFirst("Java");
        listes.addLast("PHP");
        listes.add(2, "Python");
        listes.add(".NET");
        System.out.println("LinkedList : " + listes);

        // Supprimer des éléments
        listes.remove("PHP");
        listes.remove(2);
        listes.removeLast();
        listes.removeFirst();
        System.out.println("LinkedList aprés la suppression: " + listes);

        // Nombre d'éléments dans LinkedList
        System.out.println("Taille de LinkedList = " + listes.size());
    }
}
