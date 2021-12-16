public class StockKeeper {
    public String name;

    public StockKeeper(String name) {
        this.name = name;
    }

    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies) {
        album.name = name;
        album.artist = artist;
        album.price = price;
        album.numberOfCopies = numberOfCopies;

        // afficher info album
        System.out.println("Album managed par " + this.name);
        System.out.println("Album details.....");
        System.out.println("album name  " + album.name);
        System.out.println("album artist  " + album.artist);
        System.out.println("album price   " + album.price);
        System.out.println("Album nombre de Copies   " + album.numberOfCopies);
    }
}
