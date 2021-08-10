import java.io.*;
public class AbstractFactoryPatternExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Entrez le nom de la banque a partir de laquelle vous souhaitez prendre le montant du pret: ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("Saisissez le type de pret, par ex. prêt immobilier ou pret commercial ou pret education : ");

        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Banque b = bankFactory.getBanque(bankName);

        System.out.print("\n");
        System.out.print("Saisissez le taux d'interet pour " + b.getBanqueName() + ": ");

        double rate = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Saisissez le montant du pret que vous souhaitez contracter: ");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Entrez le nombre d'annees pour payer le montant total de votre pret: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("vous contractez le pret de " + b.getBanqueName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }
}
