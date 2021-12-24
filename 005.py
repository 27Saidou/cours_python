class Employee():
    def __init__(self, name,salary):
        self.name = name
        self.__salary = salary
    
    def show(self):
        print("Name is",self.name,"and salary is",self.__salary)

emp=Employee("Massoud",40000)
emp.show()
print(emp._Employee__salary)