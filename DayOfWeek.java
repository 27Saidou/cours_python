import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un jour svp");
        String dayOfWeek = sc.nextLine();
        switch (dayOfWeek) {
        case "Sunday":
            System.out.println("Dimanche");
            break;
        case "Monday":
            System.out.println("Lundi");
            break;
        case "Tuesday":
            System.out.println("Mardi");
            break;
        case "Wednesday":
            System.out.println("Mercredi");
            break;
        case "Thursday":
            System.out.println("jeudi");
            break;
        case "Friday":
            System.out.println("Vendredi");
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
