import java.io.*;
public class MainLecture {
    public static void main(String[] args) throws IOException{

        try {
            File file = new File("D:\\input.txt");
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("fichier creer avec success");
            } else {
                System.out.println("Fichier present dans le disque  specifier");
            }
        } catch (IOException e) {
            System.out.println("Exception Erreur dans le code:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
