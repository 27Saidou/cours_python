public class SubVoiture  extends SuperMoto{
    int num=110;
    public void afficherNumber(){
        System.out.println(super.num);
    }
    public static void main(String[] args) {
        SubVoiture obj= new SubVoiture();
        obj.afficherNumber();
    }
}
