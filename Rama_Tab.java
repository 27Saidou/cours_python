import java.util.ArrayList;
import java.util.Iterator;
public class Rama_Tab {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Swift");

        Iterator<String> iterate = languages.iterator();
        System.out.println("Element: Index");

        while (iterate.hasNext()) {

            // access element
            String element = iterate.next();
            System.out.print(element + ": ");

            // access index of each element
            System.out.println(languages.indexOf(element));
        }
    }
}
