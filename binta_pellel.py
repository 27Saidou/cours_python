class Employee:

    def __init__(self, name, salary):
        self.name = name
        self.salary = salary


class Person:

    def __init__(self, name, sex):
        self.name = name
        self.sex = sex


emp = Employee("Emma", 11000)
per = Person("Brent", "male")

print(isinstance(emp, Employee))
print(isinstance(per, Employee))
