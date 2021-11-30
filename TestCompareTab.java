import java.util.Arrays;
public class TestCompareTab {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Les deux tableaux sont egales ....");
        } else {
            System.out.println("Les deux tableaux ne sont pas egales!!");
        }
    }
}
