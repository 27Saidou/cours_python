public class Majors extends Degree {
    String majors;
    Boolean ThesisCompleted = false;
    public String getMajors() {
        return majors;
    }
    public void setMajors(String majors) {
        this.majors = majors;
    }
    public Boolean getThesisCompleted() {
        return ThesisCompleted;
    }
    public void setThesisCompleted(Boolean thesisCompleted) {
        ThesisCompleted = thesisCompleted;
    }
    
}
