import java.util.ArrayList;
public class Alfa_Dynamque {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        System.out.print("Updated ArrayList: ");
        numbers.forEach((e) -> {
            e = e * 10;
            System.out.print(e + " ");
        });
    }
}
