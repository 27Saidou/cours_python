import java.util.*;

public class Algorithme_Min_Max_Med {
    public static int max, min;
    static int med;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de a :");
        int a = sc.nextInt();
        System.out.println("Entrer la valeur de b: ");
        int b = sc.nextInt();
        System.out.println("Entrer la valeur de c: ");
        int c = sc.nextInt();
        if (a >= b && b >= c) {
            max = a;
            min = c;
            med=b;
        } else if (a >= c && c >= b) {
            max = a;
            min = b;
            med = c;
        } else if (b >= a && a >= c) {
            max = b;
            min = c;
            med = a;
        } else if (b >= c && c >= a) {
            max = b;
            min = a;
            med = c;
        } else if (c >= a && a >= b) {
            max = c;
            min = b;
            med = a;
        } else if (c >= b && b >= a) {
            max = c;
            min = a;
            med = b;
        }
        System.out.println("Max=" + max + " Min=" + min + " Mediane=" + med);
        sc.close();
        System.out.println("Fin algorithm");
    }
}
