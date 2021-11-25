import java.util.*;
public class Dynamique_Tab3 extends ArrayList<String> {
    public static void main(String[] args) {
        Dynamique_Tab3 arraylist = new Dynamique_Tab3();
        arraylist.add("Java");
        arraylist.add("English");
        arraylist.add("Spanish");
        arraylist.add("Python");
        arraylist.add("JavaScript");
        System.out.println("ArrayList: " + arraylist);

        // remove elements between 1 to 3
        arraylist.removeRange(1, 3);
        System.out.println("Updated ArrayList: " + arraylist);
    }
}
