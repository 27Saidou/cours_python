import java.util.*;

public class Exo_Premier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        int r,d;
        System.out.println("Veuillez entrer un nombre  entier :");
        int n = sc.nextInt();
        r = 1;
        d = 2;
        while (r != 0 && d <= n % 2) {
            r = n % d;
            d = d + 1;
        }
        if (r != 0) {
            message = "N est premier\n";
        } else {
            message = "N n'est pas premier";

        }
        System.out.println(message);
        sc.close();
    }

    
}
