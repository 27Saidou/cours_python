# En utilisant la POO en Python, nous pouvons restreindre l'accès aux méthodes et aux variables. 
# Cela empêche les données de modification directe qui est appelée encapsulation.
# En Python, nous désignons les attributs privés en utilisant un trait de soulignement comme préfixe,
# c'est-à-dire single _ou double __

class Computer:

    def __init__(self):
        self.__maxprice = 900

    def sell(self):
        print("Selling Price: {}".format(self.__maxprice))

    def setMaxPrice(self, price):
        self.__maxprice = price


c = Computer()
c.sell()

# change the price
c.__maxprice = 1000
c.sell()

# using setter function
c.setMaxPrice(1000)
c.sell()
