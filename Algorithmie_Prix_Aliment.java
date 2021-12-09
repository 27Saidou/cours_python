import java.util.Scanner;

public class Algorithmie_Prix_Aliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrer un aliment");
        String aliment = sc.nextLine();
        switch (aliment) {
            case "Banane":
                System.out.println("Le prix d'un kg de cet aliment est :9dh");
                break;
            case "Pomme":
                System.out.println("Le prix d'un kg de cet aliment est :8dh");
                break;
            case "Avocat":
                System.out.println("Le prix d'un kg de cet aliment est: 22dh");
                break;
            case "Oignon":
                System.out.println("Le prix d'un kg de cet aliment est : 4dh");
                break;
            case "Tomate":
                System.out.println("Le prix d'un kg de cet aliment est: 3dh");
                break;
            case "Carotte":
                System.out.println("Le prix d'un kg de cet aliment est: 6dh");
                break;

            default:
                System.out.println("Aliment N'existe pas ");
                break;
        }
        sc.close();

    }
}