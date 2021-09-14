import java.io.FileReader;
import java.io.BufferedReader;
public class MainApp {
    public static void main(String[] args) {
        // Creates an array of character
        char[] array = new char[100];

        try {
            // creation du filereader
            FileReader file = new FileReader("input.txt");

            // creation du buffereader
            BufferedReader input = new BufferedReader(file);

            // lire les caractere
            input.read(array);
            System.out.println("je suis un engineer java: ");
            System.out.println(array);

            // fermez le reader
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
