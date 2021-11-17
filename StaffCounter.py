class StaffCounter:
    def __init__(self):
        self.__current = 0

    def increment(self):
        self.__current += 1

    def value(self):
        return self.__current

    def reset(self):
        self.__current = 0

counter = StaffCounter()
print(counter._StaffCounter__current)


class Person:
    def __init__(self, name):
        self.name = name

    def greet(self):
        return f"Hi, c'est moi {self.name}"

class Employee(Person):
    def __init__(self, name, job_title):
        self.name = name
        self.job_title = job_title


person = Person('Massoud')

employee = Employee('Alpha', 'Python Developer')
print(employee.greet())
print(employee.job_title)

print(isinstance(employee, Person))  # True
print(isinstance(employee, Employee))  # True
print(isinstance(person, Employee))  # False
