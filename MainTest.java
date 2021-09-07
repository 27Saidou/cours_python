public class MainTest {
    public static void main(String[] args) {
        Compte compte = new Compte();
        compte.setAcc_no(775492842L);
        compte.setName("Engineer java");
        compte.setEmail("sth_account@sth.com");
        compte.setAmount(2500f);
        System.out.println("Account No:" + compte.getAcc_no()+" "+"Account Name:"
                + compte.getName()+" \n"+"Account holder email:" + compte.getEmail()+"\n "
                + "Amount in Account:" + compte.getAmount()); 
    }
}
