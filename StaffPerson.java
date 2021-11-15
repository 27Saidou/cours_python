public class StaffPerson {
    private final String name;
    private String sex;
    public StaffPerson(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    // cette methode permet de presenter la personne
    public void affiche(){
        System.out.println("Hey Koto je m'appelle  "+ this.name +" Je suis "+ this.sex);
    }
    public static void main(String[] args) {
        StaffPerson adam=new StaffPerson("massoud","male");
        StaffPerson employee = new StaffPerson("ismatou","female");
        adam.affiche();
        employee.affiche();

    }
}
