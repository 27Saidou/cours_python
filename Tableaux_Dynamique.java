import java.util.ArrayList;
public class Tableaux_Dynamique {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();
        languages.ensureCapacity(3);
        // ajouter des éléments
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        String str=languages.get(1);
        System.out.println("Element a l'index :"+str);
        System.out.println("ArrayList: " + languages);
        languages.set(1, "C++");
        System.out.println("ArrayList:"+ languages);
        String str1 = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str1);
        

    }
}
