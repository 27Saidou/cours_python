import java.util.*;
public class Exo_Premier {
    static int N, nd, d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("Entrer la valeur de n:");
        N=sc.nextInt();
        nd=0;
        for (d = 1;d<N; d++) {
            if (N%d==0) {
                nd+=1;
                sc.close();
            }
        }
        if (N==2) {
            message="n est premier";
        } else {
            message="n n'est pas premier";
            
        }
        System.out.println(message);
        
    }
}
