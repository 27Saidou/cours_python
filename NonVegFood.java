public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String preparerFood() {
        return super.preparerFood() + " avec mafe viande  ";
    }

    public double foodprice() {
        return super.foodprice() + 150.0;
    }
}
