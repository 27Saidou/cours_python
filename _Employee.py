class Employee():
    # constructor
    def __init__(self,name,salary,project):
        # public data member
        self.name=name
        # private data member
        self.__salary= salary
        self.project=project
    
    def show(self):
        print("Name: ", self.name, 'Salaire:', self.__salary)


    def work(self):
        print(self.name,'is working on',self.project)

# creating object of a class
emp = Employee('Massoud', 8000, 'NLP')
# accessing private data members
print('Salary:', emp._Employee__salary)
emp.show()
emp.work()
