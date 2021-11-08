class Employee():
    def __init__(self,name,salary,project):
        self.name = name
        self.salary = salary
        self.project = project
    
    def show(self):
        # accessing public data member
        print("Name: ", self.name, 'Salary:', self.salary)

    def work(self):
        print(f" name{self.name} project={self.project}".format(self.name,self.project))


# creating object of a class
emp = Employee('Alfa', 8000, 'NLP')
emp.show()
emp.work()
