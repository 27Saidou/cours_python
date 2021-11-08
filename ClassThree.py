# Base class
class Vehicle:
    def Vehicle_info(self):
        print('Python')

# Child class


class Car(Vehicle):
    def car_info(self):
        print('Voiture')

# Child class


class SportsCar(Car):
    def sports_car_info(self):
        print('Sport')


# Create object of SportsCar
s_car = SportsCar()

# access Vehicle's and Car info using SportsCar object
s_car.Vehicle_info()
s_car.car_info()
s_car.sports_car_info()
