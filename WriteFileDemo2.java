import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo2 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            String mycontent = "je suis java" + " specifier le fichier";
            // Specifier le nom du fichier ici
            File file = new File("D:\\myfile6.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("Fichier Ecris avec success");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Erreur de fermeture du close " + ex);
            }
        }

    }
}
