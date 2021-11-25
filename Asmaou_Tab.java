import java.util.HashMap;

public class Asmaou_Tab {
    public static void main(String[] args) {
        // create an HashMap
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "Java");
        numbers.put(2, "Python");
        numbers.put(3, "JavaScript");

        // get the value with key 1
        String value = numbers.get(1);

        System.out.println("HashMap Value with Key 1: " + value);

        HashMap<String, Integer> primeNumbers = new HashMap<>();

        // insert entries to the HashMap
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        primeNumbers.put("Five", 5);
        System.out.println("HashMap: " + primeNumbers);

        // get the value
        int value1 = primeNumbers.get("Three");

        System.out.println("The key Three maps to the value: " + value1);

        // create an HashMap
        HashMap<Integer, String> numbers1 = new HashMap<>();

        // insert entries to the HashMap
        numbers.put(1, "Java");
        numbers.put(2, "Python");
        numbers.put(3, "JavaScript");
        System.out.println("HashMap: " + numbers1);

        // get the value
        String value2 = numbers.get(3);
        System.out.println("The key 3 maps to the value: " + value2);

        HashMap<String, Integer> numbers3 = new HashMap<>();
        numbers3.put("One", 1);
        numbers3.put("Two", 2);
        numbers3.put("Three", 3);
        System.out.println("HashMap: " + numbers3);

        // remove all mappings from HashMap
        numbers3.clear();
        System.out.println("HashMap after clear(): " + numbers3);
    }
}
