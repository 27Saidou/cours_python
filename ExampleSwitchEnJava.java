import java.util.*;

public class ExampleSwitchEnJava {
    public static void afficher_Choix(int choix) {
        switch (choix) {
        case 1:
            System.out.println("Engineer java");
            break;
        case 2:
            System.out.println("Engineer python");
            break;
        case 3:
            System.out.println("Engineer js");
            break;
        case 4:
            System.out.println("Engineer php");
            break;
        default:
            System.out.println("Engineer unknown");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entier pour faire votre choix de langage");
        int str = sc.nextInt();
        afficher_Choix(str);
        sc.close();
    }

}