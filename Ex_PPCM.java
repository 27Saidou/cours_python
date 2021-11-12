import java.util.*;

public class Ex_PPCM {
    static int ppcm, a, b, y, x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de A:");
        a = sc.nextInt();
        System.out.println("Entrer la valeur de B:");
        b = sc.nextInt();
        x = a;
        y = b;
        while (x != y) {
            if (x < y) {
                x = x + a;
            } else {
                y = y + b;
            }

        }
        ppcm = x;
        System.out.println("Le PPCM de (a et b)=" + ppcm);
        sc.close();

    }


    }
