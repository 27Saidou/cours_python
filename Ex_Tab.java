import java.util.ArrayList;
public class Ex_Tab {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Numbers: " + numbers);

        // remove all even numbers
        numbers.removeIf(e -> (e % 2) == 0);
        ;
        System.out.println("add Numbers: " + numbers);
    }
}
