public class CarStaff {
    String carName;
    String carType;
    public CarStaff(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    private String getCarName() {
        return this.carName;
    }
    
    class Engine {
        String engineType;

        void setEngine() {

            // Accessing the carType property of Car
            if (CarStaff.this.carType.equals("4WD")) {

                // Invoking method getCarName() of Car
                if (CarStaff.this.getCarName().equals("Crysler")) {
                    this.engineType = "Plus petit";
                } else {
                    this.engineType = "Plus gros";
                }

            } else {
                this.engineType = "Plus gros";
            }
        }

        String getEngineType() {
            return this.engineType;
        }
    }
}
