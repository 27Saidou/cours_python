import java.io.File;
public class Delete_File_en_Java {
    public static void main(String[] args) {
        File file = new File("output.txt");
        boolean value = file.delete();
        if (value) {
            System.out.println("Fichier deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }
    }
}
