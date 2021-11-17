import java.util.*;

public class Tester_Somme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de x");
        int x = sc.nextInt();
        System.out.println("Entrer la valeur de y");
        int y = sc.nextInt();
        int res = x + y;
        System.out.printf("La somme est %d\n", res);
        if (res < 0) {
            System.out.println("La somme est negatif");
        } else {
            if (res > 0) {
                System.out.println("La somme est positif");
            } else {
                System.out.println("La somme est null");
                sc.close();
            }
        }
    }
}
