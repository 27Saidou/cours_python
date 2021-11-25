import java.util.ArrayList;
import java.util.HashSet;
public class Dynamique_Tab2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // add element to ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("ArrayList: " + numbers);

        // create a HashSet
        HashSet<Integer> primeNumbers = new HashSet<>();

        // add elements to HashSet
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet: " + primeNumbers);

        // check if ArrayList contains all elements of HashSet
        boolean result1 = numbers.containsAll(primeNumbers);
        System.out.println("ArrayList contains all elements of HashSet: " + result1);

        // check if HashSet contains all elements of ArrayList
        boolean result2 = primeNumbers.containsAll(numbers);
        System.out.println("HashSet contains all elements of ArrayList: " + result2);
    }
}
