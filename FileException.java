import java.io.*;

public class FileException {
    public static void findFile() throws IOException {
        File newFile = new File("massoud.txt");
        FileInputStream stream = new FileInputStream(newFile);
        stream.close();
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println("File not found "+e.getMessage());
        }
    }
}
