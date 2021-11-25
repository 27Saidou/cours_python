import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Asmaou_Kassagui {
    public static void main(String[] args) {
        DogChien dog = new DogChien("Massoud", "Kassagui");

        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(dog);
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream input = new ObjectInputStream(fileStream);
            DogChien newDog = (DogChien) input.readObject();
            System.out.println("Nom du chien: " + newDog.name);
            System.out.println("Chien: " + newDog.breed);
            output.close();
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

class DogChien implements Serializable {

    String name;
    String breed;

    public DogChien(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
