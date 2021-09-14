public class Employ extends Person {
        private int EmpId;

        public Employ(String EmployeeName, String Gen, int EmployeeID) {

        super(EmployeeName, Gen);

        this.EmpId = EmployeeID;

        }

        public void Office() {

            if (EmpId == 0) {

                System.out.println("Employee est déconnectez");

            } else {

                System.out.println("Employee est Connectez");

            }


        }
        
        @Override
        public void Exam() {
            super.Exam();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public void work() {
            System.out.println("je suis un dev java");
        }

        @Override
        public void changeName(String newName) {
            super.changeName(newName);
        }

        public static void main(String[] args) {
            Person employee=new Employ("Fatoumata","female",102);
            employee.Office();
            employee.changeName("ismatou Bah");
            System.out.println(employee.toString());

        }

}
