public class Canari extends Animaux {
    Canari(int a) {
        super(a);
    }
    Canari(){
        this(1);
    }
    public void crier(){
        System.out.println("Cui-Cui!!!");
    }
}
