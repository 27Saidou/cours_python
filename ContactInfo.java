public class ContactInfo {
    private String homeAddress;
    private String emailAddress;
    private int telephoneNumber;
    public ContactInfo(String homeAddress, String emailAddress, int telephoneNumber) {
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
}
