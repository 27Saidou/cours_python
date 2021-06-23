public class SwitchCaseExample {
    public static void main(String[] args) {
        String jour="Mardi";
        switch (jour) {
            case "Mardi":
            System.out.println("Il faut faire du code java");
                break;
                case "maercredi":
                System.out.println("Il faut faire du code php");
                break;
                case "jeudi":
                System.out.println("Il faut faire du code python");
                break;
                case "vendredi":
                System.out.println("Il faut faire du code android");
                break;
                case "samedis":
                System.out.println("Il faire une pause");
                break;
        
            default:
            System.out.println("il est l'heure d'allez au plage");
                break;
        }
    }
}
