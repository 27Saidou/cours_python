import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un jour svp");
        String dayOfWeek = sc.nextLine();
        switch (dayOfWeek) {
        case "Sunday":
            System.out.println("Nous sommes Dimanche");
            break;
        case "Monday":
            System.out.println("Nous sommesLundi");
            break;
        case "Tuesday":
            System.out.println("Nous sommes Mardi");
            break;
        case "Wednesday":
            System.out.println("Nous sommes Mercredi");
            break;
        case "Thursday":
            System.out.println("jeudi");
            break;
        case "Friday":
            System.out.println("Nous sommes Vendredi");
            System.out.println("Nous sommes Vendredi");
            System.out.println("Nous sommes Vendredi");
            break;
        case "Saturday":
            System.out.println("Nous sommes Samedis");
            break;
        default:
            System.out.println("Choisir un jour dans le weekends");
            break;
        }
        sc.close();
    }
}
