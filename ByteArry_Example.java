import java.io.ByteArrayInputStream;
public class ByteArry_Example {
    public static void main(String[] args) {
        byte[] array = { 1, 2, 3, 4 };

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.print("Engineer java: ");

            for (int i = 0; i < array.length; i++) {

                // Reads the bytes
                int data = input.read();
                System.out.print(data + ", ");
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
