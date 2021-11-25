import java.util.ArrayList;
public class Tableaux_Dynamique_LastOfIndex {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // insert element to the ArrayList
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");
        System.out.println("Langages de programmation: " + languages);

        // get the position of Java occurred last
        int position1 = languages.lastIndexOf("Java");
        System.out.println("Derniere apparition de Java: " + position1);

        // C is not in the ArrayList
        // Returns -1
        int position2 = languages.lastIndexOf("C");
        System.out.println("Derniere apparition de C: " + position2);
    }
}
