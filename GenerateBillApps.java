import java.io.*;

public class GenerateBillApps {
    public static void main(String[] args) throws Exception {
        GetPlanFactory gpf = new GetPlanFactory();
        System.out.println("Entrer le nom du plan que vous voulez generer");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName =String.valueOf(br.readLine());
        System.out.print("Entrer le nombre a calculer: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = gpf.GetPlan(planName);

        System.out.print("compte us " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
