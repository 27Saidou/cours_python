import java.util.*;

public class Tableau_Bus_Algorithme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bus[];
        bus = new String[4];
        for (int i = 1; i < bus.length; i++) {
            System.out.println("Entrez votre nom svp");
            bus[i] = sc.nextLine();
            
        }
        System.out.println("Votre nom est " + bus[1]);
        System.out.println("Votre nom est " + bus[2]);
        System.out.println("Votre nom est "+bus[3]);
        sc.close();
    }
}
