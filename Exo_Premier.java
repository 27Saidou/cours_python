import java.util.*;

public class Exo_Premier {
    static int r, d;

    public static void main(String[] args) {
        int res = factoriel(5);
        int fibo = suiteFibo(500);
        System.out.println(fibo);
        ;
        System.out.println(res);
        ;
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("Veuillez entrer un nombre  entier :");
        int n = sc.nextInt();
        r = 1;
        d = 2;
        while (r != 0 && d <= n % 2) {
            r = n % d;
            d = d + 1;
        }
        if (r != 0) {
            message = "N est premier";
        } else {
            message = "N n'est pas premier";

        }
        System.out.println(message);
        sc.close();
    }

    public static int factoriel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factoriel(n - 1));
        }
    }

    public static int suiteFibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (n * suiteFibo(n - 1) + suiteFibo(n - 2));
        }
    }
}
