import java.util.*;

public class ExampleSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre svp");
        int day = sc.nextInt();
        switch (day) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }
        sc.close();

    }
}