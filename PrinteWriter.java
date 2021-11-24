import java.io.*;
public class PrinteWriter {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;

        try {
            System.out.println("Entrer le try block");
            br = new BufferedReader(new FileReader("test.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println("Ligne =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException en try block =>" + e.getMessage());
        } finally {
            System.out.println("Entrer finally block");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IOException en finally block =>" + e.getMessage());
            }

        }
    }
}
