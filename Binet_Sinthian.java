import java.io.PrintStream;
public class Binet_Sinthian {
    public static void main(String[] args) {
        String data = "engineer java et mon grd frere est Engineer python";
        try {
            PrintStream output = new PrintStream("output.txt");
            output.print(data);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
