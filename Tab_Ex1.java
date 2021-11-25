import java.util.ArrayList;
public class Tab_Ex1 {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("ArrayList: " + numbers);

        // multiply 2 to all elements of the hashmap
        numbers.replaceAll(e -> e * 2);
        ;
        System.out.println("Updated ArrayList: " + numbers);
    }
}
