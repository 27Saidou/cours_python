import java.util.Scanner;

public class Maximu2 {
    
    // cette fonction permet de calculer le maximum de quatre nombres
    public static int max(int x, int y) {
        int result;
        if (x >= y) {
            result = x;
        } else {
            result = y;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de A");
        int a = sc.nextInt();
        System.out.println("Entrer la valeur de B");
        int b = sc.nextInt();
        System.out.println("Entrer la valeur de C");
        int c = sc.nextInt();
        System.out.println("Entrer la valeur de D");
        int d = sc.nextInt();
        int max1 = max(a, b);
        int max2 = max(c, d);
        int max = max(max1, max2);
        System.out.println("Le maximum de quatre entier est de :" + max);
        sc.close();
    }

}