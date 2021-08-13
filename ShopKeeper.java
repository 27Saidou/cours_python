public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop techno;
    private MobileShop blackberry;

    public ShopKeeper() {
        iphone = new Iphone();
        techno = new Techno();
        blackberry = new Blackberry();
    }

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale() {
        techno.modelNo();
        techno.price();
    }

    public void blackberrySale() {
        blackberry.modelNo();
        blackberry.price();
    }
}
