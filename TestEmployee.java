public class TestEmployee {
    public static void main(String[] args) {
        StafEmployee employee = new StafEmployee("Diallo","Massoud",30);
        employee.afficher_information_employee();
        System.out.println("nombre d\'objets creer " + StafEmployee.getNombre());
        StafEmployee emp2 = new StafEmployee(" BA","Ramatoulaye",22);
        emp2.afficher_information_employee();
        System.out.println("Nombre d\'objets creer "+ StafEmployee.getNombre());
        
    }
}
