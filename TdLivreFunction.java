import java.util.*;

public class TdLivreFunction {
    public static void affiche(ArrayList<String> languages) {
        for (String langage : languages) {
            System.out.println("Voici la liste des Langages de Programmation :" + langage);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        affiche(languages);
    }
}
