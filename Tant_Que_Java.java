import java.util.Scanner;
public class Tant_Que_Java {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter un nombre");
        int number = input.nextInt();
        while (number >= 0) {
            sum += number;
            System.out.println("Enter un nombre");
            number = input.nextInt();
        }
        System.out.println("Somme = " + sum);
        input.close();
    }
}
