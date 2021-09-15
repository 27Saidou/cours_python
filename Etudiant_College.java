public class Etudiant_College extends Etre_Humain {
    private String cours = "Java";

    public static void main(String[] args) {
        Etudiant_College st = new Etudiant_College();
        st.getName();
        System.out.println(st.name + "\n" + st.cours);

    }
}
