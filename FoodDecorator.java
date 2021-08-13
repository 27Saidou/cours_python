public abstract class FoodDecorator implements Food {
    private Food newFood;

    public FoodDecorator(Food newFood) {
        this.newFood = newFood;
    }
    @Override
    public String preparerFood() {
        return newFood.preparerFood();
    }

    public double foodprice(){
        return newFood.foodprice();
    }
}
