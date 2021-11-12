import java.util.*;

public class Tdn_Pgcd {
    public static void main(String[] args) {
        int pgcd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur entier de a:");
        int a = sc.nextInt();
        System.out.println("Entrer la valeur entier de b:");
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        pgcd = x;
        System.out.println("Le PGCD de (A et B)=" + pgcd);
        sc.close();
    }
}