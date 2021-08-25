import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class EnvoyeClass {
    public static void main(String[] args) {
    
        try {
            Etudiant etudiant = new Etudiant(101, 25, "Rama", "Bah", 6);
            FileOutputStream fos=new FileOutputStream("etudiant.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(etudiant);
            oos.flush();
            oos.close();
            fos.close();
            System.out.println("Serialisez avec success");
        } catch (IOException e) {
        System.out.println(" erruer dans le code "+e.getMessage());
        }
    }
}
