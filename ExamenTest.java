import java.util.Scanner;
public class ExamenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Examen examen=new Examen();
        System.out.println("Entrer le nom de la matiere");
        String matiere = sc.nextLine();
        examen.afficher_Examen_de_la_Matiere(matiere);
        sc.close();
    }
}
