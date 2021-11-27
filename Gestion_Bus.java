
import java.util.*;

public class Gestion_Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bus = new String[70];
        for (int i = 1; i <=70; i++) {
            bus[i] = sc.nextLine();
            System.out.println(i);
        }
        sc.close();
    }
}
