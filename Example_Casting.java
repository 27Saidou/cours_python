public class Example_Casting {
    public static void main(String[] args) {
        double num = 10.99;
        System.out.println("The double value: " + num);

        // convert into int type
        int data = (int) num;
        System.out.println("The integer value: " + data);


        int num1 = 10;
        System.out.println("The integer value is: " + num);

        // converts int to string type
        String data1 = String.valueOf(num1);
        System.out.println("The string value is: " + data1);

        String data2 = "10";
        System.out.println("The string value is: " + data);

        // convert string variable to int
        int num2= Integer.parseInt(data2);
        System.out.println("The integer value is: " + num2);
    }
}
