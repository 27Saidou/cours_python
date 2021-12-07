import java.util.Scanner;

public class Algorithmie_In_Java {
    public static int printMaximum(int x, int y) {
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
        System.out.println("Veuillez Entrer la valeur de a");
        int a = sc.nextInt();
        System.out.println("Veuillez Entrer la valeur de b");
        int b = sc.nextInt();
        System.out.println("Veuillez entrer la valeur de c");
        int c = sc.nextInt();
        System.out.println("Veuillez entrer la valeur de d");
        int d = sc.nextInt();
        int max1 = printMaximum(a, b);
        int max2 = printMaximum(c, d);
        int max = printMaximum(max1, max2);
        System.out.println("Le maximum de quatre nombre entier est de :" + max);
        sc.close();

    }
}
