public class MaClassEnfant {
    public static void main(String[] args) {
        AnimalSauvage as= new AnimalSauvage();
        AnimalSauvage chat=new AnimalDomestique();
        AnimalSauvage chien=new ChienDomestique();
        as.cri();
        chat.cri();
        chien.cri();
    }
}
