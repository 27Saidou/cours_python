public class SwitchDemo {
    public static void main(String[] args) {
        int jour_de_la_semaine=3;
        switch (jour_de_la_semaine) {
            case 1:
                System.out.println("Nous sommes lundi");
                break;

            case 2:
                System.out.println("Nous sommes mardi");
                break;
            case 3:
                System.out.println("Nous sommes mercredi");
                break;
                case 4:
                System.out.println("Nous sommes jeudi");
                break;        
        
            default:
            System.out.println("Valeur incorrect\t");
                break;
        }
    }
}
