public class KeeperStock {
    private String name;
    
    public KeeperStock(String name) {
        setName(name);
    }

    public void manageAlbum(AlbumEncapsulation album, String name, String artist, double price, int numberOfCopies) {
        /*
         * Defining states and behaviors for album
         */
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);
        /*
         * Afficher album details
         */
        System.out.println("Album managed by :" + getName());
        System.out.println("Album details::::::::::");
        System.out.println("Album name : " + album.getName());
        System.out.println("Album artist : " + album.getArtist());
        System.out.println("Album price : " + album.getPrice());
        System.out.println("Album number of copies : " + album.getNumberOfCopies());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
