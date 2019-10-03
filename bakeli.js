var Employee = /** @class */ (function () {
    function Employee() {
        this.name = "toto";
        this.retired = false;
        this.manager = null;
        this.reports = [];
    }
    return Employee;
}());
var emp = new Employee();
console.log(emp.name);
