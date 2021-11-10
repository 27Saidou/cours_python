public class Degree extends EtudiantBantignel {
    private String Degree_Title;
    private int semester;
    private float SGPA;
    private float CGPA;
    public String getDegree_Title() {
        return Degree_Title;
    }
    public void setDegree_Title(String degree_Title) {
        Degree_Title = degree_Title;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public float getSGPA() {
        return SGPA;
    }
    public void setSGPA(float sGPA) {
        SGPA = sGPA;
    }
    public float getCGPA() {
        return CGPA;
    }
    public void setCGPA(float cGPA) {
        CGPA = cGPA;
    }
    
}
