public class Programmer extends Employees {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer developeur = new Programmer();
        System.out.println("La salaire du programmer est de "+developeur.salary);
        System.out.println("Le bonus du programmer est de "+ developeur.bonus);
    }
}
