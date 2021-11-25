import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class Binta_Bantignel {
    public static void main(String[] args) {
        String data = "J'aime mon village sinthian";

        try {

            FileOutputStream file = new FileOutputStream(" flush.txt");
            BufferedOutputStream buffer = new BufferedOutputStream(file);
            buffer.write(data.getBytes());
            buffer.flush();
            System.out.println("Enregistrement success.");
            buffer.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
