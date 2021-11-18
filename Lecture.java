import java.util.*;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un entier");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Entrer du texte str1");
        String str1 = sc.nextLine();
        System.out.println("Entrer du  texte str2");
        String str2 = sc.nextLine();
        System.out.println("La valeur de n est " + n + " et la valeur de str1 est =" + str1
                + " et la valeur de str2 est =" + str2);
        sc.close();

    }
}
