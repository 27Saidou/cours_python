public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard card=new BankCustomer();
        card.giveBankDetails();
        System.out.println(card.getCreditCard());
    }
}
