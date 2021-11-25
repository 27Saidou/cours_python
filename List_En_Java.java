import java.util.List;
import java.util.ArrayList;
public class List_En_Java {
    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Access aux Element: " + number);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Suppression des  Elements: " + removedNumber);
    }
}
