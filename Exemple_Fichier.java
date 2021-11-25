import java.io.FileWriter;
public class Exemple_Fichier {
    public static void main(String[] args) {
        String data = "Alfa and python";
        try {

            FileWriter output = new FileWriter("output.txt");

            output.write(data);
            System.out.println("Donnees ecris dans le fichier.");
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
