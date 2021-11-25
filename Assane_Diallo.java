import java.io.FileWriter;
import java.io.BufferedWriter;

public class Assane_Diallo {
    public static void main(String[] args) {
        String data = "Alfa Engineer Python";

        try {
            FileWriter file = new FileWriter("output.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write(data);
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
