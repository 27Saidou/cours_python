import java.util.*;

public class Notion_Algorithme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la valeur de N");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " est paire");
        } else {
            System.out.println(n + " est impaire");
            sc.close();
        }

    }
}
