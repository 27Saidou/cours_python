public class ExampleAssertion {
    // Les assertions en Java aident à détecter les bogues en testant le code que
    // nous supposons vrai
    public static void main(String[] args) {
        String[]weekends= { "Friday", "Saturday", "Sunday" };
        assert weekends.length==2;
        System.out.println("Il y a  "+ weekends.length+" week-ends dans une semaine");
    }
}
