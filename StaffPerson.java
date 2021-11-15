
public class StaffPerson {
    private String name;
    private String sex;

    public StaffPerson(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    // cette methode permet de presenter la personne
    public void affiche() {
        System.out.println("Hey Koto je m'appelle  " + this.name + " Je suis " + this.sex);
    }

    public static void main(String[] args) {
        StaffPerson adam = new StaffPerson("massoud", "male");
        StaffPerson employee = new StaffPerson("ismatou", "female");
        adam.affiche();
        employee.affiche();

        System.out.println(PGCD(336,18));
        

    }

    static int PGCD(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a > b)
                return PGCD(a - b, b);
            else
                return PGCD(a, b - a);
        }
    }
}
