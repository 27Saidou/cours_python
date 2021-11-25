import java.io.FileReader;
import java.io.BufferedReader;

public class Example_Buffereader {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            FileReader file = new FileReader("input.txt");
            BufferedReader input = new BufferedReader(file);
            input.skip(5);
            input.read(array);
            System.out.println("Success:");
            System.out.println(array);
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
