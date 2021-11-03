import javax.swing.JOptionPane;

public class Table {
    public static void main(String[] args) {
        String staille = JOptionPane.showInputDialog("Entrez la taille du vecteur ");
        int taille = Integer.parseInt(staille);
        int tab[] = new int[taille];
        int i;
        String sval;
        for (i = 0; i < tab.length; i++) {
            sval = JOptionPane.showInputDialog("Entrer la valeur a la cellule " + i);
            tab[i] = Integer.parseInt(sval);
        }
        System.out.println("Affichage des valeurs du vecteur ");
        for (i = 0; i < tab.length; i++) {
            System.out.println("|" + tab[i] + " ");
        }
    }
}
