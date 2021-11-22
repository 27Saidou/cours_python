// Overriding methode in java example
class CarVoiture{
    public int speedLimit() {
        return 100;
    }
}
public class Forde extends CarVoiture{
    public int speedLimit() {
        return 150;
    }
    public static void main(String[] args) {
        CarVoiture c=new Forde();
        int num=c.speedLimit();
        System.out.println("La limite est de :"+num);
    }
}
