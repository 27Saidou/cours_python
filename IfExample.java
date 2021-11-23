import java.util.Scanner;
public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un  langage de programmation svp");
        String langage=sc.nextLine();
        if (langage.equals("java")) {
            System.out.println("Meilleur langage de programmation");
        }else {
            System.out.println("un langage de programmation moyen ");
            sc.close();
        }
    }
}
