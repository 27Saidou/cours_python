public class Voter {
    private String name;
    private int age;
    private String address;
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
        if (age<=18) throw new IllegalArgumentException("Age ne doit pas etre inferieur a 18 ans "); {
            this.age = age; 
        }
    
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String afficherItems(){
        StringBuilder sb=new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Address: ").append(getAddress()).append("\n");
        sb.append("Age").append(getAge());
        return sb.toString();
        
    }
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("Alpha Diallo");
        voter.setAge(25);
        voter.setAddress("Guinee,Sinthian Hamdallaye");
        System.out.println(voter.afficherItems());
    }
}

