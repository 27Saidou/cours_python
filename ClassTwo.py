# Parent class 1 exemple inheritance multiple
class Person:
    def person_info(self, name, age):
        print('Liste Personne')
        print("Name", name,"Age=", age)
        

# Parent class 2


class Company():
    def company_info(self, company_name, location):
        print('Liste Company')
        print('Name:', company_name, 'location:', location)

# Child class


class Employee(Person, Company):
    def Employee_info(self, salary, skill):
        print("A l\'interieur de Employee class")
        print('Salary:', salary, 'Skill:', skill)


# Create object of Employee
emp = Employee()

# access data
emp.person_info('Alfa', 28)
emp.company_info('Google', 'Atlanta')
emp.Employee_info(12000, 'Machine Learning')
