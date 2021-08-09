public class SubVoiture  extends SuperMoto{
    int num=110;
    void display(){
    System.out.println("Methode de class Enfant");
    }
    public void afficherNumber(){
        System.out.println(super.num);
    }
    public void afficherMessage(){
        display();
        super.display();
    }
    public static void main(String[] args) {
        SubVoiture obj= new SubVoiture();
        obj.afficherNumber();
        obj.afficherMessage();
    }
}
