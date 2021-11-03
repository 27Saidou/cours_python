import javax.swing.JOptionPane;

public class Categorie {
    public static void main(String[] args) {
        String first_name = JOptionPane.showInputDialog(" Entrer votre nom");
        String last_name = JOptionPane.showInputDialog("Entrer votre prenom");
        int poids = Integer.parseInt(JOptionPane.showInputDialog("Entrer votre Poids"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Entrer votre age svp !"));
        System.out.println(first_name + " " + last_name + " " + age + "ans est de ");
        if (poids < 10) {
            System.out.println("Categorie poussin");
        } else if (poids <= 25 && poids >= 10) {
            System.out.println("Categorie pupille");
        } else if (poids > 25) {
            System.out.println("Categorie normale");
        } else {
            System.out.println("AU revoir !");

        }

    }
}
