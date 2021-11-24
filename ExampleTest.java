public class ExampleTest {
    Size pizzaSize;
    
    public ExampleTest(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    
    public void orderPizza() {
        switch (pizzaSize) {
        case PETIT:
            System.out.println("J'ai commande une pizza de taille petit.");
            break;
        case MOYEN:
            System.out.println("J'ai commande une pizza de taille moyenne");
            break;
        default:
            System.out.println("Je ne comprends pas cette commande.");
            break;
        }
    }

    public static void main(String[] args) {
        ExampleTest e1=new ExampleTest(Size.MOYEN);
        e1.orderPizza();
    }
}

