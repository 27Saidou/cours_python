import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if (age>18) {
            System.out.println("Vous etes adulte");
        } else {
            System.out.println("Vous n'etes pas adulte");
            sc.close();
        }
    }
}
