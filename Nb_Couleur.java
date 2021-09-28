import java.util.Scanner;
public class Nb_Couleur{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez la couleur...");
        String couleur_du_feu=sc.nextLine();
        switch (couleur_du_feu) {
            case "Vert":
                System.out.println("je passe");
                break;
            case "Orange":
                System.out.println("je Ralenti");
                break;
            case "Rouge":
                System.out.println("je m'arrete !!!!");
                break;
            default:
            System.out.println("Invalid je ne sais pas de quelle couleur est cette feu");
                break;
                
        }
        sc.close();
    }
}