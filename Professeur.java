public class Professeur {
    private String designation = "Teacher";
    private String collegeName = "Beginnersbook";
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    /** Une fonction est un bloc d'instructions qui exécute une tâche spécifique */
    public void travail(){
        System.out.println("Enseigne");
    }
}
