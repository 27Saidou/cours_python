public class Album {
    public String name;
    public String artist;
    public double price;
    public int numberOfCopies;

    public void sellCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("Un album a ete vendu");
        } else {
            System.out.println("No more album disponible");
        }
    }

    public void commandeCopies(int num) {
        numberOfCopies+=num;
    }
}
