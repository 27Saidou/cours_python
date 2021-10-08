import java.util.Scanner;
public class Selon_Algorithmique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner votre moyenne s'il vous plait Mr.");
        int moyenne = sc.nextInt();
        switch(moyenne) {
            case 16:
                System.out.println("Mention tres bien");
                break;
            case 14:
                System.out.println("Mention bien");
                break;
            case 12:
                System.out.println("Assez bien");
                break;   
            case 10:
                System.out.println("Passable");
                break;
            default:
                System.out.println("Vous n'etes pas admis");
                break;
        }
        sc.close();
    }
}
