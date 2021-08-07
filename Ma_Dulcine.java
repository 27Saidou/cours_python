import java.util.Scanner;

public class Ma_Dulcine {
    static int max;

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Donnez la valeur de la variable n1");
        int n1 = clavier.nextInt();
        System.out.println("Donnez la valeur de la variable n2");
        int n2 = clavier.nextInt();
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        System.out.println("Le Maximum est de =" + max);
        clavier.close();
    }
}