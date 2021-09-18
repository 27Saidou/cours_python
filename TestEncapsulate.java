public class TestEncapsulate {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setGeekName("Massoud commandant");
        obj.setGeekAge(19);
        obj.setGeekRoll(51);
        
        // affichage des informations 
        System.out.println("name: " + obj.getGeekName());
        System.out.println("age: " + obj.getGeekAge());
        System.out.println("roll: " + obj.getGeekRoll());
    }
}
