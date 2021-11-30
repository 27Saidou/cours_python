public class TestEncapsulationApp {
    public static void main(String[] args) {
        UserName user1 = new UserName("massoud", "Java", "massoud", "java@yahoo.com", "alfa");
        System.out.println("Username est " + user1.toString() + "\n");
        user1.setUsername("Nafiou Barry");
        System.out.println("mon nouveau username est " + user1.getUsername() + "\n");
        System.out.println("Mon mot de passe est de " + user1.getPassword());
        System.out.println("Je veux changer mon mot de passe\n");
        user1.setPassword("massoud_commadant");
        System.out.println("Mon nouveau mot de passe est de " + user1.getPassword());
    }
}
