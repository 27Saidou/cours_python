import java.util.*;

public class Algorithme_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de A:");
        int a = sc.nextInt();
        System.out.println("Entrer la valeur de B :");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Le maximum c'est " + a);
        } else {
            if (a == b) {
                System.out.println("Egalites parfait...");
            } else {
                System.out.println("Le maximum c'est " + b);
                sc.close();
            }
        }

    }
}
