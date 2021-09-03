import java.util.ArrayList;
public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("java");
        cars.add("python");
        cars.add("php");
        cars.add("js");
        for (String str: cars) {
            System.out.println(str);
        }
    }
}
