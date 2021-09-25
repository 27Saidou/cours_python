import java.util.Scanner;
public class Conditions_Tp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Bonjour");
        }else if (button == 2) {
            System.out.println("A Diarama poulo");
        }else if (button == 3){
            System.out.println("No deef");
        }else{
            System.out.println("Invalid button");
            sc.close();
        }
    }
}
