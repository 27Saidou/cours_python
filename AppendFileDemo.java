import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendFileDemo {
    public static void main(String[] args) {
        try {
            String content = "Alpha est un dev python " + "Django our favorite best subject";
            // specifier le nom du fichier ici
            File file = new File("D://myfile7.txt");

            /*
             * logique pour la creation du fichier ici
             */
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);

            bw.close();

            System.out.println("Data successfully appended dans le file");

        } catch (IOException ioe) {
            System.out.println("Exception levée:");
            ioe.printStackTrace();
        }
    }
}
