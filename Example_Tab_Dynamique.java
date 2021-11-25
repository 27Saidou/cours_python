import java.util.ArrayList;
public class Example_Tab_Dynamique {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        System.out.println("ArrayList: " + numbers);

        // remove element between 1 to 3
        numbers.subList(1, 3).clear();
        System.out.println("Updated ArrayList: " + numbers);
    }
}
