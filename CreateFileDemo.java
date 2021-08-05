import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\newfile2.txt");
        
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("Fichier creer avec successfully");
            } else {
                System.out.println("Fichier existe dans le disque ");
            }
        } catch (IOException e) {
            System.out.println("Exception Levée:");
            e.printStackTrace();
        }
    }
}
