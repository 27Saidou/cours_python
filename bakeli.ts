class Employee {
    public name: string;
    public address: string;
    public retired = false;
    public manager: Employee = null;
    public reports: Employee[] = [];
}
let emp=new Employee();
console.log(emp.name);
