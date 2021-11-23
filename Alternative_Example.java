import java.util.Scanner;

public class Alternative_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");
        int number = sc.nextInt();
        System.out.println("Entrer la taille svp");
        String size = sc.nextLine();
        switch (number) {

        case 29:
            size = "Small";
            break;

        case 42:
            size = "Medium";
            break;
        case 44:
            size = "Large";
            break;

        case 48:
            size = "Extra Large";
            break;

        default:
            size = "Unknown";
            break;

        }
        System.out.println("Size: " + size);
        sc.close();
    }
}
