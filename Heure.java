public class Heure {
    private int h;
    private int m;
    private int s;

    public Heure(int s) {
        this.s = s;
    }

    public Heure(int s, int m) {
        this(s);
        this.m = m;

    }

    public Heure(int s, int m, int h) {
        this(s, m);
        this.h = h;

    }

    public void affiche() {
        System.out.println("Heure courante est " + h + " " + m + " " + s);
    }

    public void afficheUniversel() {
        if (h < 12) {
            System.out.println("heure AM" + h + " " + m + "  :" + s);
        } else {
            System.out.println("Heure PM " + (h % 12) + " :" + m + " " + s);
        }
    }
}
