public class DemoApp  extends Sum{
    public int sumOfTwo(int num1, int num2) {
        return num1 + num2;
    }

    public int sumOfThree(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        Sum obj=new DemoApp();
        System.out.println(obj.sumOfTwo(18, 18));
        System.out.println(obj.sumOfThree(20, 20,24));
        obj.disp();
    }
}
