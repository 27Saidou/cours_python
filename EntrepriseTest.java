public class EntrepriseTest {
    public static void main(String[] args) {
        Personne[]entreprise = new Personne[5];
        entreprise[0] = new Chef("Alfa", 1000, 500);
        entreprise[1] = new Chef("Nafiou", 1000, 600);
        entreprise[2] = new Personne("Isma", 620);
        entreprise[3] = new Personne("Rama", 700);
        entreprise[4] = new Personne("Kadiatou", 100);
        for (int i = 0; i < 5; ++i) {
            if (entreprise[i] instanceof Chef)
                System.out.print("Chef : ");
            System.out.println(entreprise[i].toString());
        }
    }
}
