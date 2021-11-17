import java.util.*;

public class Algorithme_Test_Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la note :");
        float note = sc.nextFloat();
        String message;
        if (note >= 0 && note <= 20) {
            message = "La note " + note + " est correct";
        } else {
            message = "La note " + note + " est incorrect";
        }
        System.out.println(message);
        sc.close();
    }
}
