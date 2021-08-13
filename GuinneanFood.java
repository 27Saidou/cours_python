public class GuinneanFood extends FoodDecorator {
    GuinneanFood(Food newFood) {
        super(newFood);
    }
    
    public String preparerFood() {
        return super.preparerFood() + " avec du riz ";
    }

    public double foodprice() {
        return super.foodprice() + 65.0;
    }
}
