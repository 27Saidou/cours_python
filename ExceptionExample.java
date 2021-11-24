public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int divisionByZero=5/0;
            System.out.println(divisionByZero);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException "+e.getMessage());
        }finally {
            System.out.println("c'est le dernier bloc ");
        }
    }
}
