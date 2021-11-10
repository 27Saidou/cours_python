public class StaffVoiture {
    private String model;
    private String carburant;
    private int numberGear;
    private boolean auto;
    public StaffVoiture(String model, String carburant, int numberGear, boolean auto) {
        this.model = model;
        this.carburant = carburant;
        this.numberGear = numberGear;
        this.auto = auto;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarburant() {
        return carburant;
    }
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
    public int getNumberGear() {
        return numberGear;
    }
    public void setNumberGear(int numberGear) {
        this.numberGear = numberGear;
    }
    public boolean isAuto() {
        return auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
    }
    
    
}

