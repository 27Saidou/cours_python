import java.util.*;
public class CalculMoyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la moyenne de l'eleve s'il vous plait");
        int moy_Notes= sc.nextInt();
        if (moy_Notes<18) {
            System.out.println("Mention tres bien");
        }else if(moy_Notes<=20){
            System.out.println("Mention Excellent");
        }else{
            System.out.println("Echec");
            sc.close();
        }
    }
}
