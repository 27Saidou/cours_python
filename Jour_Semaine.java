import java.util.Scanner;

public class Jour_Semaine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entier svp");
        int jour = sc.nextInt();
        switch (jour) {
        case 1:
            System.out.println("Nous sommes Lundi");
            break;
        case 2:
            System.out.println("Nous sommes Mardi");
            break;
        case 3:
            System.out.println("Nous sommes Mercredi");
            break;
        case 4:
            System.out.println("Nous sommes Jeudi");
            break;
        case 5:
            System.out.println("Nous sommes Vendredi");
            break;
        case 6:
            System.out.println("Nous sommes Samedi");
            break;
        case 7:
            System.out.println("Nous sommes Dimanche");
            break;
        default:
            System.out.println("Jour Invalid ");
            break;

        }
        sc.close();
    }
}
