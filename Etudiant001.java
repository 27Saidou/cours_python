public class Etudiant001 {
    private String name;
    private int age;
    private int grade;
    private ContactInfo contactInfo;// Student HAS-A ContactInfo
    
    public Etudiant001(String name, int age, int grade, ContactInfo contactInfo) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.contactInfo = contactInfo;
    }

    public void study() {
        System.out.println("Study");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    
}
