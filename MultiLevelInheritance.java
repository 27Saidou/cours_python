public class MultiLevelInheritance {
    public static void main(String[] args) {
        Majors std34= new Majors();
        std34.setStudent_Name("Alpha Diallo");
        std34.setDegree_Title("Engineer java");
        std34.setMajors("Data Science");
        System.out.println(std34.getStudent_Name());
        System.out.println(std34.getDegree_Title());
        System.out.println(std34.getMajors());

    }
}
