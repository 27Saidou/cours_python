import java.util.*;

public class EstPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un mot svp");
        String motSaisi = sc.nextLine();
        if (!(motSaisi.equals("motSaisi"))) {
            System.out.println(motSaisi + " est un palindrome");
        } else {
            System.out.println(motSaisi + " n'est pas un palindrome");
            sc.close();
        }
        
    }
}
