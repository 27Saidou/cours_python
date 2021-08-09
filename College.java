public class College {
    String collegeName;
    // Creating HAS-A relationship with Address class
    Address1 collegeAddr;

    College(String name, Address1 addr) {
        this.collegeName = name;
        this.collegeAddr = addr;
    }
    // ici mettre la methode afin que le code ressemble a celui du précedent
}
