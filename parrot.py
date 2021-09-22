class Parrot:

    # instance attributes
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # instance methode
    def sing(self, song):
        return "{} sings {}".format(self.name, song)

    def dance(self):
        return "{} is now dancing".format(self.name)

# instance des attribut
blu = Parrot("Blu", 10)

# appelle instance des methodes
print(blu.sing("'Happy'"))
print(blu.dance())


class Computer:

    def __init__(self):
        self.__maxprice = 900

    def sell(self):
        print("Prix de Vente: {}".format(self.__maxprice))

    def setMaxPrice(self, price):
        self.__maxprice = price

c = Computer()
c.sell()

# changez le prix
c.__maxprice = 1000
c.sell()
# utilisation d'un mutateur
c.setMaxPrice(1000)
c.sell()
