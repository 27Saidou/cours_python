import java.util.ArrayList;
public class Tab_Dynamique1 {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add element to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);

        // trim capacity to 3
        languages.trimToSize();
        System.out.println("Size of ArrayList: " + languages.size());
    }
}
