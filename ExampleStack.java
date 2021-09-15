import java.util.Stack;
public class ExampleStack {
    public static void main(String[] args) {
        Stack<String>languages = new Stack<String>();
        languages.push("java");
        languages.push("Python");
        languages.push("PHP");
        System.out.println("Piles"+languages);
        // Supprimer l'élément de la pile
        String e = languages.pop();
        System.out.println("Element supprimer: " + e);

        System.out.println("Pile: " + languages);

        // Accéder à l'élément depuis le haut
        String h = languages.peek();
        System.out.println("Element en haut: " + h);
        int index=languages.search("PHP");
        System.out.println("Position du PHP "+index);
    }
}
