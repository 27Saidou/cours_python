public class MainClass {
    public static void main(String[] args) {
        Anim A = new Anim();
        Anim h = new Herbivore(); 
        Anim o = new Omnivore(); 
        Anim c = new Carnivore();
        Cat chat=new Cat();
        A.mange();
        h.mange();
        o.mange();
        c.mange();
        chat.mange();
    }
}
