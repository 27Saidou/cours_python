import java.util.*;

public class Example_Procedure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cop, x, co;
        float pourcent;
        cop = 0;
        co = 0;
        do {
            System.out.println("Entrez la valeur de X");
            x = sc.nextInt();
            co = co + 1;
            if (x % 2 == 0) {
                cop += 1;
            }

        } while (x == -1);
        pourcent = cop * 100 / co;
        System.out.println("Nombre de valeur paire =" + cop + "et leur pourcentage =" + pourcent);
        sc.close();
    }
}
