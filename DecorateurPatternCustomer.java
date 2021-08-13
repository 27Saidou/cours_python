import java.io.*;
public class DecorateurPatternCustomer {
    private static int choice;
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Guinnean Food.         \n");
            System.out.print("            4. Quitter                        \n");
            System.out.print("Entrez votre choix: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
            case 1: {
                VegFood vf = new VegFood();
                System.out.println(vf.preparerFood());
                System.out.println(vf.foodprice());
            }
                break;

            case 2: {
                Food f1 = new NonVegFood((Food) new VegFood());
                System.out.println(f1.preparerFood());
                System.out.println(f1.foodprice());
            }
                break;
            case 3: {
                Food f2 = new GuinneanFood((Food) new VegFood());
                System.out.println(f2.preparerFood());
                System.out.println(f2.foodprice());
            }
                break;

            default: {
                System.out.println("autre aliment pas disponible");
            }
                return;
            }

        } while (choice != 4);
    }
}
