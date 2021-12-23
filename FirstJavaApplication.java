import java.util.*;

public class FirstJavaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la premier valeur de A");
        int a = sc.nextInt();
        System.out.println("Entrez la second valeur de B");
        int b = sc.nextInt();
        float res = a + b;
        System.out.println("La sommes de " + a + " et " + b + " est :" + res);
        sc.close();
    }
}