public class Bicycle 
{
    public int equipement;
    public int vitesse;
    public Bicycle(int equipement, int vitesse) {
        this.equipement = equipement;
        this.vitesse = vitesse;
    }
    public void appliqueFrein(int decrement){
        vitesse -=decrement;
    }
    public void Accelerer(int increment){
        vitesse +=increment;
    }
    public String toString(){
        return ("Le nombre d'engrenages est "+equipement+ "\n"+"La vitesse du velo est de:"+vitesse);
    }
}
