public class EmployeeTest {
    public static void main(String[] args) {
        Employee3 E;
        Journaliers j = new Journaliers(" Ba ", " Fatoumata ", 20, 230);
        Commissionnaire c = new Commissionnaire(" Fall ", " Modou ", 50000, 60, 180);
        // liaison dynamique
        E = j;
        System.out.println("Type Employee " + E.obtenirNom() + " Salaire : " + E.salaire());
        // liaison dynamique
        E = c;
        System.out.println("Type Employee " + E.obtenirNom() + " Salaire : " + E.salaire());
        Employee3 tab[] = new Employee3[3];
        tab[0] = new Journaliers("Ba", "Massoud", 30, 350);
        tab[1] = new Commissionnaire("Diallo", "Isma", 30000, 350, 200);
        tab[2] = j;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Type Employee " + tab[i].obtenirNom() + " Salaire" +tab[i].salaire());
        }

    }
}
