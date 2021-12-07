import java.util.*;

public class LinksListe {
    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<String>();
        liste.addFirst("a");
        liste.addFirst("is");
        System.out.println(liste);

        liste.addFirst("this");
        liste.add("List");
        System.out.println(liste);
        System.out.println(liste.size());
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i) + "->");
        }
        System.out.println("null");
        liste.removeFirst();
        System.out.println(liste);
        liste.removeLast();
        System.out.println(liste);
    }
}
