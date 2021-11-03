
public class Personne1 {
    private String name;
    private String username;
    private String address;

    public Personne1(String name, String username, String address) {
        this.name = name;
        this.username = username;
        this.address = address;
    }

    public void affiche() {
        System.out.println("Le nom de la personne est :" + name);
        System.out.println("Le prenom de la personne est :" + username);
        System.out.println("L'addresse de la personne est :" + address);
    }

}
