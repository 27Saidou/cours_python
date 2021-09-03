import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("Fichier creer avec success: " + myObj.getName());
            } else {
                System.out.println("Fichier existe deja.");
            }
        } catch (IOException e) {
            System.out.println("une erreur dans  le code.");
            e.printStackTrace();
        }
    }
}