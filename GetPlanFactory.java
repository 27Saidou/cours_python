public class GetPlanFactory {
    public  Plan GetPlan(String planType){
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("Developpeur web")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("OXFAMPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
