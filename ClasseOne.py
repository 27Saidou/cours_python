# Base class
class Vehicle:
    def Vehicle_info(self):
        print('je suis un developpeur python')

# Child class


class Car(Vehicle):
    def car_info(self):
        print('je suis un developpeur java ')


# Create object of Car
car = Car()

# access Vehicle's info using car object
car.Vehicle_info()
car.car_info()
