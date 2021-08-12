import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Entrez le nom du titulaire :");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Entrez le numero du compte:");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Entrez le nom de la banque :");
            String bankname = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();
        return ("Le numero du compte " + accno + " de  " + accholdername + " de  " + bname
                + "banque valide et authentic pour l'utilisation du credit card ");
    }

}
