public class JavaConcat {
    public static void main(String[] args) {
        String firstName = "Alfa";
        String lastName = "Diallo";
        System.out.println(firstName.concat(lastName));

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
