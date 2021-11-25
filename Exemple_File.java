import java.io.File;
public class Exemple_File {
    public static void main(String[] args) {
        File file = new File("emilioFile.txt");

        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("fichier creer.");
            } else {
                System.out.println("Fichier exist.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
