import java.util.*;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // ArrayList prend en charge les tableaux dynamiques qui peuvent évoluer selon
        // les besoins.
        // Ajouter des éléments à l'ArrayList
        list.add("Pascal");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        list.add(0, "Java");

        System.out.println("La taille de l'ArrayList: " + list.size());
        // Afficher l'ArrayList
        System.out.println("Le contenu de l'ArrayList: " + list);
        // Supprimer des éléments de l'ArrayList
        list.remove("Pascal");
        // Afficher l'ArrayList
        System.out.println("ArrayList apres la suppression: " + list);
    }
}
