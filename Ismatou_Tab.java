import java.util.ArrayList;
import java.util.Iterator;

public class Ismatou_Tab {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // Add elements in the array list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Swift");
        Iterator<String> iterate = languages.iterator();
        System.out.print("ArrayList: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
