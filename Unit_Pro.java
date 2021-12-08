import java.util.*;
public class Unit_Pro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre s'il vous plait");
        int first_number = sc.nextInt();
        System.out.println("Entrez un operateur(+,-,*,%,/):");
        char operator=sc.next().charAt(0);
        int second_number = sc.nextInt();
        int res=0;
        switch (operator) {
            case '+':
                res=first_number+second_number;
                System.out.println("La somme de deux est "+res);
                break;
            case '-':
                res = first_number - second_number;
                System.out.println("La somme de deux est " + res);
                break;
            case '*':
                res = first_number * second_number;
                System.out.println("La somme de deux est " + res);
                break;
            case '%':
                res = first_number % second_number;
                System.out.println("La somme de deux est " + res);
                break;
            case '/':
                res = first_number /second_number;
                System.out.println("La somme de deux est " + res);
                break;
            default:
            System.out.println("Invalid Caractere veuillez entrez un operateur valide");
                break;
                
        }
        sc.close();

    }
}