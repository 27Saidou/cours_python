public class ExterneApplication {
    public static void main(String[] args) {
        MotherBoard.USB m1=new MotherBoard.USB();
        System.out.println("le nombre de port est de :"+m1.getTotalPort());
    }
}
