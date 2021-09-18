public class Sbi extends Rbi {

    @Override
    public void deposit() {
        System.out.println("whoof");
        
    }
    public static void main(String[] args) {
        Rbi obj=new Sbi();
        obj.deposit();
    }
}
