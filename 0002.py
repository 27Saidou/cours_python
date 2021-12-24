class Student:
    def __init__(self, name, age):
        self.name = name
        self.__age = age
    
    def get_age(self):
        return self.__age

    def set_age(self, age):
        self.__age = age
emp=Student("ismatou",14)
print("Name: " +emp.name,emp.get_age())
emp.set_age(16)
print("Name: " +emp.name,emp.get_age())