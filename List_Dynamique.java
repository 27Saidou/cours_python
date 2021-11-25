import java.util.ArrayList;

public class List_Dynamique {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages1 = new ArrayList<>();

        // insert element to the ArrayList
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        System.out.println("ArrayList 1: " + languages1);

        // create another ArrayList
        ArrayList<String> languages2 = new ArrayList<>();

        // add elements to ArrayList
        languages2.add("English");
        languages2.add("Java");
        languages2.add("Python");
        System.out.println("ArrayList 2: " + languages2);

        // retain the common element
        languages1.retainAll(languages2);
        System.out.println("Commun Elements: " + languages1);
    }
}
