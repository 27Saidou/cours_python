import java.util.ArrayList;
import java.util.HashSet;
public class Dynamique_tab {
    public static void main(String[] args) {
        // create an ArrayList
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
        primeNumbers.add(5);
        System.out.println("HashSet: " + primeNumbers);

        // retain common elements in the ArrayList
        numbers.retainAll(primeNumbers);
        System.out.println("Communs Elements: " + numbers); 
    }
}
