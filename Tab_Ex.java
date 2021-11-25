import java.util.ArrayList;
public class Tab_Ex {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        // replace all elements to uppercase
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}
