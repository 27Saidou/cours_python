public class Personne002 {
    private String nom;
    private String prenom;
    private int age;
    private String address;
    static int nbrePersonne=0;
    public Personne002(String nom, String prenom, int age, String address) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.address = address;
        Personne002.nbrePersonne++; //
    }
    public static void main(String[] args) {
        System.out.println("Test Reference\t");
        Personne002 p1 = new Personne002("Massoud","Dabo",49,"Afghan");
        Personne002 p2 = new Personne002("Modou","Dia",50,"Guinee");
        p1=p2;
        p2.nom="Diallo";
        p2.prenom="Alfa";
        System.out.println("Personne p1 " +p1.nom+ " " +p1.prenom);
        System.out.println("Personne p2 "+p2.nom+ " " +p2.prenom);
    }
}
