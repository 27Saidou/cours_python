public class Employee1 extends StaffPersonne {
    private int matricule;
    private String service;
    private float salaire_de_base;
    private float prime;

    public Employee1(String nom, String prenom, int age, int matricule, String service, float salaire_de_base,
            float prime) {
        super(nom, prenom, age);
        this.matricule = matricule;
        this.service = service;
        this.salaire_de_base = salaire_de_base;
        this.prime = prime;
    }

    public float calculSalaireNet() {
        return (salaire_de_base + prime);
    }

    public void affiche() {
        super.affiche();
        System.out.println("Matricule de l\' employee  " + matricule);
        System.out.println("Le service de l'employee  " + service);
        System.out.println("Salaire de base de l'employee " + salaire_de_base);
        System.out.println("Le salaire net de l'employee " + calculSalaireNet());
    }
}
