import java.util.*;
public class Gestion_Bus001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bus[]=new String[70];
        for (int i = 1; i <70; i++) {
            System.out.println("Entrez votre nom");
            bus[i] = sc.nextLine();
            System.out.println(bus[i]+" ");
        }
        sc.close();
    }
}
