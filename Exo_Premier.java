import java.util.*;

public class Exo_Premier {
    static int r,d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("Veuillez entrer un nombre  entier :");
        int n= sc.nextInt();
        r=1;
        d=2;
        while(r!=0 && d<=n%2){
            r=n%d;
            d=d+1;
        }
        if (r!=0) {
        message="N est premier";
        } else {
        message="N n'est pas premier";
    
        }
        System.out.println(message);
        sc.close();
    }
}
