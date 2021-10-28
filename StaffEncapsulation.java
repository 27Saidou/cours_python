public class StaffEncapsulation {
    public static void main(String[] args) {
        StaffBanquaire compte=new StaffBanquaire();
        compte.setAcc_no(112);
        compte.setName("Alfa");
        compte.setEmail("alphonse2016@yahoo.com");
        compte.setAmount(120000f);
        System.out.println(compte.getAcc_no()+" "+compte.getName()+" "+compte.getEmail()+" "+compte.getAmount());
    }
}
