class Voiture:

    def __init__(self):
          self .__updateSoftware()

    def drive(self):
        print('conduite')

    def __updateSoftware(self):
        print('logiciel de mise à jour')

redcar = Voiture()
redcar.drive()

#concept d'heritage en python


class Person(object):

    # Constructor
    def __init__(self, name):
        self.name = name

    
    def getName(self):
        return self.name

    
    def isEmployee(self):
        return False


class Employee(Person):

   
    def isEmployee(self):
        return True


emp = Person("Geek1")  
print(emp.getName(), emp.isEmployee())

emp = Employee("Geek2")  
print(emp.getName(), emp.isEmployee())
