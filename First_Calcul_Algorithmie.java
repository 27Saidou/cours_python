import java.util.*;

public class First_Calcul_Algorithmie{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre ");
        int firstNumber=sc.nextInt();
        System.out.println("Entrez le second nombre ");
        int secondNumber=sc.nextInt();
        System.out.println("Entrez le type d'operateur");
        sc.nextLine();
        char operateur=sc.nextLine().charAt(0);
        int result=0;
        switch (operateur) {
            case '+':
                result=firstNumber+secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;

            default:
            System.out.println("Invalid Operateur");
                break;
        }
        System.out.println("Le resultat est : " + result);
        sc.close();
    }
}