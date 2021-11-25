import java.util.HashMap;

public class Example_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // remove all mappings from HashMap
        numbers.clear();
        System.out.println("HashMap after clear(): " + numbers);

        HashMap<Integer, String> languages1 = new HashMap<>();

        // add mappings to HashMap
        languages1.put(1, "Python");
        languages1.put(2, "C");
        languages1.put(3, "Java");
        System.out.println("Languages: " + languages1);

        // remove the mapping with key 2
        languages1.remove(2); // return C

        System.out.println("Updated Languages: " + languages1);

        HashMap<String, String> details = new HashMap<>();

        // add mappings to HashMap
        details.put("Name", "Programmation");
        details.put("Domain", "programmation.com");
        details.put("Location", "Conakry");
        System.out.println("Programmation Details: \n" + details);

        // check if key Domain is present
        if (details.containsKey("Domain")) {
            System.out.println("Domain name is present in the Hashmap.");

            HashMap<Integer, String> language = new HashMap<>();

            // add mappings to HashMap
            language.put(1, "Python");
            language.put(2, "Java");
            language.put(3, "JS");
            System.out.println("HashMap" + language);

            // check if value Java is present
            if (language.containsValue("Java")) {
                System.out.println("Java is present on the list.");
            }

            // create a HashMap
            HashMap<String, String> countries = new HashMap<>();

            // add mappings to HashMap
            countries.put("Washington", "USA");
            countries.put("Canberra", "Australia");
            System.out.println("HashMap:\n" + countries);

            // check if the value Spain is present
            if (!countries.containsValue("Spain")) {
                // add entry if Value already not present
                countries.put("Madrid", "Spain");
            }

            System.out.println("Updated HashMap:\n" + countries);
        }
    }
}
