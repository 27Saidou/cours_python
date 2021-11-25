import java.io.FileOutputStream;
public class File_Read {
    public static void main(String[] args) {
        String data = "je suis un developeur java";

        try {
            FileOutputStream output = new FileOutputStream("output.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
