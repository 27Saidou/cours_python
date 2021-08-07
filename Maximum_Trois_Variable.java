import java.util.Scanner;

public class Maximum_Trois_Variable {
    public static int MAX;
    public static int n1, n2, n3;

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Donnez la valeur de la premier variable....");
        n1 = clavier.nextInt();
        System.out.println("Donnez la second  valeur de la variable...");
        n2 = clavier.nextInt();
        System.out.println("Donnez la third valeur de la variable...");
        n3 = clavier.nextInt();
        if (n1 > n2) {
            MAX = n1;
        } else {
            MAX = n2;
        }
        if (n3 > MAX) {
            MAX = n3;
        }
        System.out.println("Le maximum de ses trois valeurs est=" + MAX);
        clavier.close();
    }
}
