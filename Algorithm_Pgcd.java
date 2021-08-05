
import java.util.Scanner;
class Algorithm_Pgcd {

    public static int PGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return PGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez la valeur de A:");
        int a = clavier.nextInt();
        System.out.println("Veuillez entrez la valeur de B");
        int b = clavier.nextInt();
        System.out.println("Le PGCD de " + a + " et " + b + " est = " + PGCD(a, b));
        clavier.close();
    }
}