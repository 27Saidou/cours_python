public class TestEncapsulation {
    public static void main(String[] args) {
        // creation d'une instance de la classe compte
        Account acc = new Account();
        // modification des attributs
        acc.setAcc_no(7560504000L);
        acc.setName("Alpha Diallo");
        acc.setEmail("alpha@yahoo.com");
        acc.setAmount(500000f);
        // afficher les informations du compte
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
