import java.util.*;
public class TD_Algorithmie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************\n");
        System.out.println("*Programme a Voter *\n");
        System.out.println("*==================*\n");

        System.out.println("Donnez votre Age s'il vous plait !");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("Vous avez l'age pour voter");
        }else {
            System.out.println("Vous n'avez l'age pour voter");
        }
        sc.close();
    }
}
