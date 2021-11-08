class Vehicle:
    def vehicle_info(self):
        print("Vehicule class")


class Car(Vehicle):
    def car_info(self):
        print("Voiture class")


class Truck(Vehicle):
    def truck_info(self):
        print("Truck Class")

# Sports Car can inherits properties of Vehicle and Car


class SportsCar(Car, Vehicle):
    def sports_car_info(self):
        print("voiture de sport")


# create object
s_car = SportsCar()

s_car.vehicle_info()
s_car.car_info()
s_car.sports_car_info()
