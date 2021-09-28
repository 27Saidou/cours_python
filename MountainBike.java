public class MountainBike extends Bicycle {
    public int hauteur_assise;

    public MountainBike(int equipement, int vitesse,int hauteur_assise) {
        super(equipement, vitesse);
        this.hauteur_assise = hauteur_assise;
    }

    public int getHauteur_assise() {
        return hauteur_assise;
    }

    public void setHauteur_assise(int newvalue) {
        hauteur_assise = newvalue;
    }
    @Override
    public String toString() {
        return (super.toString()+"\n la hauteur du siege est "+hauteur_assise);
    }
}
