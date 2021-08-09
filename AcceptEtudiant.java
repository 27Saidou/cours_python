import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class AcceptEtudiant {
    public static void main(String[] args) {
        Etudiant o = null;
        try {
            FileInputStream fis = new FileInputStream("etudiant.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Etudiant) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Etudiant Class is not found.");
            cnfe.printStackTrace();
            return;
        }
        System.out.println("Nom Etudiant:" + o.getStuName());
        System.out.println("Age Etudiant:" + o.getStuAge());
        System.out.println("Etudiant rollNum:" + o.getStuRollNum());
        System.out.println("Etudiant Address:" + o.getStuAddress());
        System.out.println("Taille Etudiant:" + o.getStuHeight());
    }
}
