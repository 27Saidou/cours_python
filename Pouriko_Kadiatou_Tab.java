import java.util.HashMap;
public class Pouriko_Kadiatou_Tab {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();

        // add entries to the HashMap
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");
        System.out.println("HashMap: " + languages);

        // Change all value to uppercase
        languages.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("Updated HashMap: " + languages);


        // create an HashMap
        HashMap<Integer, Integer> numbers = new HashMap<>();

        // insert entries to the HashMap
        numbers.put(5, 0);
        numbers.put(8, 1);
        numbers.put(9, 2);
        System.out.println("HashMap: " + numbers);

        // replace all value with the square of key
        numbers.replaceAll((key, value) -> key * key);
        ;
        System.out.println("Updated HashMap: " + numbers);
    }
}
