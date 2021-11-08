class Company:
    def fun1(self):
        print("Inside parent class")


class Employee(Company):
    def fun2(self):
        print("Inside child class.")


class Player:
    def fun3(self):
        print("Inside Player class.")


# Result True
print(issubclass(Employee, Company))
