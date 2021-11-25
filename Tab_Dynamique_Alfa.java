import java.util.ArrayList;
public class Tab_Dynamique_Alfa {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        // add elements to the ArrayList
        countries.add("Iceland");
        countries.add("America");
        countries.add("Ireland");
        countries.add("Canada");
        countries.add("Greenland");
        System.out.println("Countries: " + countries);

        // remove all even countries
        countries.removeIf(e -> e.contains("land"));
        ;
        System.out.println("Countries without land: " + countries);
    }
}
