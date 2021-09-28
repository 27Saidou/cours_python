public class MultiplyFun {
    public  int multiplier(int a,int b) {
        return a *b;
    }
    
    public  double multiplier(double a,double b) {
        return a * b;
    }
    public static void main(String[] args) {
        MultiplyFun obj = new MultiplyFun();
        System.out.println(obj.multiplier(2, 4));
        System.out.println(obj.multiplier(5.5, 6.3));
    }
}
