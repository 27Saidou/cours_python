class Employee:
    # variable class
    company_name="Bailobaya_technologie"

    # constructor qui initialize les objects
    def __init__(self,name,salary):
        # instance variable
        self.name = name
        self.salary = salary

    # instance method
    def affichage(self):
        print(f"name={self.name},Salary ={self.salary}")

# create first object
employee=Employee("Fatoumata",12000)
employee.affichage()
# create second object
emp2 = Employee("Emma", 10000)
emp2.affichage()
print(Employee.company_name)
