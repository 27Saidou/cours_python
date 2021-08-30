public class TestAnimaux {
    public static void main(String[] args) {
        Canari titi=new Canari(3);
        Canari mimi = new Canari();
        titi.ageMaxi=5;
        titi.vieillit();
        titi.crier();
        titi.vieillit(4);
        mimi.vieillit(5);
        mimi.crier();
    }
}
