# inherits,extend,override
class Employee:
    
    def __init__(self,name,age,salary):
        self.name = name
        self.age = age
        self.salary = salary

    def work(self):
        print(f"{self.name}  is working...")


class SoftwareEngineering(Employee):
    def __init__(self,name,age,salary,level):
        super().__init__(name,age,salary)
        self.level = level
    
    def work(self):
        print(f"{self.name}  is coding...")

    def debug(self):
        print(f"{self.name} is debugging...")
        

class Designer(Employee):

    def work(self):
        print(f"{self.name}  is designing...")

    def draw(self):
        print(f"{self.name} is drawing...")


se=SoftwareEngineering("Max",24,6000,"Junior")
#se.work()

d=Designer("Alfa", 27,7000)
#d.work()


# Polymorphisme
employees=[SoftwareEngineering("Max",25,6000,"Junior"),SoftwareEngineering("Lisa",30,9000,"Senior"),
Designer("Alfa",27,7000)]

def motivate_employees(employees):
    for employee in employees:
        employee.work()

motivate_employees(employees)
