import javax.swing.JOptionPane;

public class TraiteChaine {
    public static void main(String[] args) {
        int nbmots;
        String str = JOptionPane.showInputDialog("Donner une chaine");
        nbmots = compteMots(str);
        JOptionPane.showMessageDialog(null, "La chaine a " + nbmots + " nbmots");
        System.exit(0);
    }
    // cette methode permet de compter le nombre mot saisie
    public static int compteMots(String str) {
        boolean trouvemots = false;
        int n, i, ct = 0;
        n = str.length();
        for (i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                trouvemots = true;
            } else if (trouvemots == true) {
                ct++;
                trouvemots = false;
            }
        }
        if (trouvemots)
            ct++;

        return ct;
    }
}
