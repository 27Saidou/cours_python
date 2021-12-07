class Etudiant 
{
    String name;
    static String school;
    public static void changeSchool(){
        school="newschool";
        System.out.println(school);
    }

}
public class Apna_Alfa {
    public static void main(String[] args) {
        Etudiant.school="NIIT";
        Etudiant etudiant = new Etudiant();
        etudiant.name="ramatoulaye";
        Etudiant.changeSchool();
        System.out.println(etudiant.name);

    }
}
