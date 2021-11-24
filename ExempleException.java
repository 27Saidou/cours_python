import java.io.*;
public class ExempleException {
    public static void findFile() throws IOException {
    
        File newFile = new File("oumar_Massoud.txt");
        FileInputStream stream = new FileInputStream(newFile);
        stream.close();
    }
    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
        System.out.println(e);
        }
    }
}
