# parent class
class Person(object):

        # __init__ is known as the constructor
        def __init__(self, name, idnumber):
                self.name = name
                self.idnumber = idnumber

        def display(self):
                print(self.name)
                print(self.idnumber)

# child class
class Employee(Person):
        def __init__(self, name, idnumber, salary, post):
                self.salary = salary
                self.post = post
                Person.__init__(self, name, idnumber)


a = Person('Rahul', 886012)

a.display()
