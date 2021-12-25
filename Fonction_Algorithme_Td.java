import java.util.Scanner;

public class Fonction_Algorithme_Td {
    public static int max(int x, int y) {
        int max;
        if (x >= y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
    public static int minimum(int x, int y) {
        int min;
        if (x<=y) {
            min =x;
        } else {
            min = y;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de A");
        int a = sc.nextInt();
        System.out.println("Entrez la second valeur de B");
        int b = sc.nextInt();
        int res = max(a, b);
        System.out.println("Le maximum de " + a + " et " + b + " est " + res);
        System.out.println("Le minimum  est:"+minimum(23,2));
        sc.close();
    }
}