import java.util.Scanner;

public class Example_For {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de n");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("java est amusant");
            sc.close();
        }
        int[] numbers = { 3, 7, 5, -5 };
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
