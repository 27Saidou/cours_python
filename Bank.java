class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "massoud";
        account1.email = "massoud@gmail.com";
        account1.setPassword("abc");
        System.out.println(account1.getPassword());
    }
}
