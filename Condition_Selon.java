import java.util.Scanner;
public class Condition_Selon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
            System.out.println("Bonjour les developeurs java");
                break;
                case 2:
                System.out.println("Bonjour les developeurs python");
                break;
                case 3:
                System.out.println("Bonjour les developeurs js");
                break;
            default:
            System.out.println("Oups! vous n'etes pas des devs");
                break;
                
        }
        sc.close();
    }
}
