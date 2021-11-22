class Printer {
    public void print(Paper p) {
        p.setText("perdu mon gars");
    }
}

class Paper {
    String text;

    public void setText(String t) {
        this.text = t;
    }

    public String getText() {
        return text;
    }

}

public class JouerAvecObject {
    public static void main(String[] args) {
        Paper p = new Paper();
        p.setText("Hello Developpeur mobile java");
        System.out.println(p.getText());
        Printer hp = new Printer();
        hp.print(p);
        
    }
}
