class Car:  # parent class

    def __init__(self, name, mileage):
        self.name = name
        self.mileage = mileage

    def description(self):
        return f"The {self.name} car gives the mileage of {self.mileage}km/l"


class BMW(Car):  # child class
    pass


class Audi(Car):  # child class
    def audi_desc(self):
        return "This is the description method of class Audi."


obj1 = BMW("BMW 7-series", 39.53)
print(obj1.description())

obj2 = Audi("Audi A8 L", 14)
print(obj2.description())
print(obj2.audi_desc())


class Parent_1:
    def f1(self):
        print("je suis la classe parent.")


class Parent_2:
    def f2(self):
        print("je suis la fonction  parent 2.")


class Parent_3:
    def f3(self):
        print("je suis la fonction de la parent 3.")


class Child(Parent_1, Parent_2, Parent_3):
    def f4(self):
        print("je suis la fonction de la classe fille.")


object_1 = Child()
object_1.f1()
object_1.f2()
object_1.f3()
