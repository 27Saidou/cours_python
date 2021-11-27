import java.util.*;
public class Mineur_Majeur{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre age svp");
        int age=sc.nextInt();
        if(age<=18){
            System.out.println("Vous etes mineur");
        }else{
            System.out.println("Vous majeur");
            sc.close();
        }
    }
}