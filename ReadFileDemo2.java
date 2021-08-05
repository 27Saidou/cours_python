import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedReader br2 = null;
        try {
            br = new BufferedReader(new FileReader("D:\\myfile4.txt"));

            // Lire le premier fichier en utilisant cette methode
            System.out.println("Lire le fichier en utilisant cette methode read:");
            String contentLine = br.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine();
            }

            br2 = new BufferedReader(new FileReader("D:\\myfile3.txt"));

            // lire  le fichier2
            System.out.println("Lire le fichier en utilisant la methode read :");
            int num = 0;
            char ch;
            while ((num = br2.read()) != -1) {
                ch = (char) num;
                System.out.print(ch);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (br2 != null)
                    br2.close();
            } catch (IOException ioe) {
                System.out.println("Erreur de fermeture" + ioe);
            }
        }
    }
}
