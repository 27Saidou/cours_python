public class Demo_Test extends Alpha {

    @Override
    int add(int a, int b) {
        int resultat=a+b;
        return resultat;
    }

    @Override
    int add_of_three(int a, int b, int c) {
        int res=a+b+c;
        return res;
    }
    public static void main(String[] args) {
        Alpha demo=new Demo_Test();
        System.out.println(demo.add(10, 27));
        System.out.println(demo.add_of_three(46, 45, 88));
        demo.display();
    }
}
