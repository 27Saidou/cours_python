# base Class
class Vehicle:

    def __init__(self, name, color, price):
        self.name = name
        self.color = color
        self.price = price

    def info(self):
        print(self.name, self.color, self.price)
# Child class


class Car(Vehicle):

    def change_gear(self, no):
        print(self.name, 'change gear to number', no)


# creation du premier object
car = Car('BMW X1', 'Black', 35000)
car.info()
car.change_gear(5)
