public class StaffEmp {
    int id;
    String name;
    StaffAddress address;
    public StaffEmp(int id, String name, StaffAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display(){
        System.out.println(id+" "+ name);
        System.out.println(address.city +" "+ address.state +" "+ address.country);
    }
    public static void main(String[] args) {
        StaffAddress address=new StaffAddress("Bailobaya","Conakry","Guinee");
        StaffEmp staffEmp=new StaffEmp(111,"Massoud", address);
        staffEmp.display();
    }
}
